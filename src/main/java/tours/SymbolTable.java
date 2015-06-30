package tours;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private Stack<Map<String, Variable>> symbolList;
    private int identifierCount;

    public SymbolTable() {
        symbolList = new Stack<>();
        symbolList.push(new HashMap<>());
        identifierCount = 0;
    }

    public int getLevel() {
        return symbolList.size() - 1;
    }

    public void openScope() {
        symbolList.push(new HashMap<>());
    }

    public void closeScope() {
        if (getLevel() == 0) {
            throw new RuntimeException("Cannot close outer scope");
        }
        symbolList.pop();
    }

    public void add(String id, Type type) {
        symbolList.peek().put(id, new Variable(type, identifierCount++));
    }

    public void addType(String id, Type type) {
        symbolList.peek().put(id, new Variable(type, -1));
    }

    public boolean containsInCurrentScope(String id) {
        return symbolList.peek().containsKey(id);
    }

    public boolean contains(String id) {
        for (int i = getLevel(); i >= 0; i--) {
            if (symbolList.get(i).containsKey(id)) {
                return true;
            }
        }

        return false;
    }

    public Type getType(String id) {
        for (int i = getLevel(); i >= 0; i--) {
            if (symbolList.get(i).containsKey(id)) {
                return symbolList.get(i).get(id).getType();
            }
        }
        return null;
    }

    public int getIdentifier(String id) {
        for (int i = getLevel(); i >= 0; i--) {
            if (symbolList.get(i).containsKey(id)) {
                return symbolList.get(i).get(id).getIdentifier();
            }
        }
        return -1;
    }

    public class Variable {
        private final Type type;
        private final int identifier;

        public Variable(Type type, int identifier) {
            this.type = type;
            this.identifier = identifier;
        }

        public Type getType() {
            return type;
        }

        public int getIdentifier() {
            return identifier;
        }
    }
}
