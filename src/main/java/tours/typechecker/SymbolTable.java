package tours.typechecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private Stack<Map<String, Integer>> symbolList;

    public SymbolTable() {
        symbolList = new Stack<>();
        symbolList.push(new HashMap<>());
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

    public void add(String id, Integer type) {
        symbolList.peek().put(id, type);
    }

    public boolean contains(String id) {
        return symbolList.peek().containsKey(id);
    }

    public int getType(String id) {
        for (int i = getLevel(); i >= 0; i--) {
            if (symbolList.get(i).containsKey(id)) {
                return symbolList.get(i).get(id);
            }
        }
        return -1;
    }
}