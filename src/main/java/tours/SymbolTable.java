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
        identifierCount =0;
    }

    /**
     * Resets the identifierCount, to make sure memory is saved for program arguments
     */
    public void resetCount(){
        identifierCount = 0;
    }


    public int getIdentifierCount() {
        return identifierCount;
    }

    /**
     * Returns the current depth of the symbol table
     */
    public int getLevel() {
        return symbolList.size() - 1;
    }

    /**
     * Opens a new scope, and resets the argumentsCounter if its a new function
     */
    public void openScope() {
        symbolList.push(new HashMap<>());
    }

    /**
     * Closes the current scope
     */
    public void closeScope() {
        if (getLevel() == 0) {
            throw new RuntimeException("Cannot close outer scope");
        }
        symbolList.pop();
    }

    /**
     * Adds a variable with identifier (memory location) to the symbol table
     * @param id the identifier of the variable
     * @param type the type of the variable
     * @param identifier the identifier number of the variable
     */
    public void addVariable(String id, Type type, int identifier) {
        symbolList.peek().put(id, new Variable(type, identifier));
    }

    /**
     * Adds a new variable to the symbol table
     * @param id the identifier of the variable
     * @param type the type of the variable
     */
    public void addVariable(String id, Type type) {
        addVariable(id, type, identifierCount++);
    }

    /**
     * Adds the argument variables to the symbol table
     * @param variables map with the identifier and the type of the arguments
     */
    public void addArgumentVariables(Map<String, Type> variables) {
        variables.forEach(this::addVariable);
    }


    /**
     * Adds a type with identifier to the symbol table
     * @param id the identifier
     * @param type the type
     */
    public void addType(String id, Type type) {
        symbolList.peek().put(id, new Variable(type, -1));
    }


    /**
     * Adds a function with identifier, type and arguments to the symbol table
     * @param id the identifier of the function
     * @param type the type of the function
     * @param arguments list of types of the arguments of the function
     */
    public void addFunction(String id, Type type, List<Type> arguments) {
        symbolList.peek().put(id, new Function(type, arguments));
    }

    /**
     * Checks whether or not the current scope contains the identifier
     * @param id the identifier
     * @return if the current scope contains the id, true else false
     */
    public boolean containsInCurrentScope(String id) {
        return symbolList.peek().containsKey(id);
    }

    /**
     * Checks whether or not the symbol table contains the identifier
     * @param id the identifier of the variable or function
     * @return if the symbol table contains the id, true else false
     */
    public boolean contains(String id) {
        for (int i = getLevel(); i >= 0; i--) {
            if (symbolList.get(i).containsKey(id)) {
                return true;
            }
        }

        return false;
    }

    public Type getType(String id) {
        Symbol type = getSymbol(id);
        return (type != null) ? getSymbol(id).getType() : null;
    }

    public Symbol getSymbol(String id) {
        for (int i = getLevel(); i >= 0; i--) {
            if (symbolList.get(i).containsKey(id)) {
                return symbolList.get(i).get(id);
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
