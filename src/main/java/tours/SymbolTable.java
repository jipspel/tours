package tours;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private Stack<Map<String, Symbol>> symbolList;
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

    public void addVariable(String id, Type type) {
        symbolList.peek().put(id, new Variable(type, identifierCount++));
    }

    public void addVariables(Map<String, Type> variables) {
        variables.forEach((id, type) -> addVariable(id, type));
    }

    public void addType(String id, Type type) {
        symbolList.peek().put(id, new Variable(type, -1));
    }

    public void addFunction(String id, Type type, List<Type> arguments) {
        symbolList.peek().put(id, new Function(type, arguments));
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
                return ((Variable) symbolList.get(i).get(id)).getIdentifier();
            }
        }
        return -1;
    }

    public List<Type> getArgumentTypes(String id) {
        for (int i = getLevel(); i >= 0; i--) {
            if (symbolList.get(i).containsKey(id)) {
                return ((Function) symbolList.get(i).get(id)).getArgumentTypes();
            }
        }
        return null;
    }

    public abstract class Symbol {
        protected Type type = null;

        public Type getType() {
            return type;
        }
    }

    public class Variable extends Symbol {
        private final int identifier;

        public Variable(Type type, int identifier) {
            this.type = type;
            this.identifier = identifier;
        }

        public int getIdentifier() {
            return identifier;
        }
    }

    public class Function extends Symbol {
        private final List<Type> argumentTypes;

        public Function(Type type, List<Type> argumentTypes) {
            this.type = type;
            this.argumentTypes = argumentTypes;
        }

        public List<Type> getArgumentTypes() {
            return argumentTypes;
        }
    }
}
