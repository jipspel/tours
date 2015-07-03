package tours;

import tours.grammar.ToursParser;

public class Type {
    public static final Type BOOLEAN = new Type(ToursParser.BOOLEAN);
    public static final Type CHARACTER = new Type(ToursParser.CHARACTER);
    public static final Type INTEGER = new Type(ToursParser.INTEGER);
    public static final Type STRING = new Type(ToursParser.STRING);
    public static final Type VOID = new Type(ToursParser.VOID);

    public static final Type BOOLEAN_ARRAY = new Type(ToursParser.BOOLEAN_ARRAY);
    public static final Type CHARACTER_ARRAY = new Type(ToursParser.CHARACTER_ARRAY);
    public static final Type INTEGER_ARRAY = new Type(ToursParser.INTEGER_ARRAY);
    public static final Type STRING_ARRAY = new Type(ToursParser.STRING_ARRAY);

    public static final String BOOLEANJAVA = "Z";
    public static final String CHARACTERJAVA = "C";
    public static final String INTEGERJAVA = "I";
    public static final String STRINGJAVA = "Ljava/lang/String;";
    public static final String VOIDJAVA = "V";

    public static final String BOOLEANARRAYJAVA = "[Z";
    public static final String CHARACTERARRAYJAVA = "[C";
    public static final String INTEGERARRAYJAVA = "[I]";
    public static final String STRINGARRAYJAVA = "Ljava/lang/String;[]";

    private final int type;

    public Type(int type) {
        this.type = type;
    }

    public Type(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "boolean" :
                this.type = BOOLEAN.getType();
                break;
            case "boolean[]" :
                this.type = BOOLEAN_ARRAY.getType();
                break;
            case "character" :
                this.type = CHARACTER.getType();
                break;
            case "character[]" :
                this.type = CHARACTER_ARRAY.getType();
                break;
            case "integer" :
                this.type = INTEGER.getType();
                break;
            case "integer[]" :
                this.type = INTEGER_ARRAY.getType();
                break;
            case "string" :
                this.type = STRING.getType();
                break;
            case "string[]" :
                this.type = STRING_ARRAY.getType();
                break;
            case "void" :
                this.type = VOID.getType();
                break;
            default :
                throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    public int getType() {
        return type;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Type &&
                this.getType() == ((Type) object).getType();
    }

    @Override
    public String toString() {
        if (type == Type.BOOLEAN.getType()) {
            return "boolean";
        } else if (type == Type.CHARACTER.getType()) {
            return "character";
        } else if (type == Type.INTEGER.getType()) {
            return "integer";
        } else if (type == Type.STRING.getType()) {
            return "string";
        } else if (type == Type.VOID.getType()) {
            return "void";
        } else if (type == Type.BOOLEAN_ARRAY.getType()) {
            return "boolean[]";
        } else if (type == Type.CHARACTER_ARRAY.getType()) {
            return "character[]";
        } else if (type == Type.INTEGER_ARRAY.getType()) {
            return "integer[]";
        } else if (type == Type.STRING_ARRAY.getType()) {
            return "string[]";
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    public String getJavaObjectType() {
        if (type == Type.BOOLEAN.getType()) {
            return BOOLEANJAVA;
        } else if (type == Type.BOOLEAN_ARRAY.getType()) {
            return BOOLEANARRAYJAVA;
        } else if (type == Type.CHARACTER.getType()) {
            return CHARACTERJAVA;
        } else if (type == Type.CHARACTER_ARRAY.getType()) {
            return CHARACTERARRAYJAVA;
        } else if (type == Type.INTEGER.getType()) {
            return INTEGERJAVA;
        } else if (type == Type.INTEGER_ARRAY.getType()) {
            return INTEGERARRAYJAVA;
        } else if (type == Type.STRING.getType()) {
            return STRINGJAVA;
        } else if (type == Type.STRING_ARRAY.getType()) {
            return STRINGARRAYJAVA;
        }else if (type == Type.VOID.getType()) {
            return VOIDJAVA;
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    public String getArrayType() {
        if (type == Type.BOOLEAN.getType()) {
            return "boolean";
        } else if (type == Type.BOOLEAN_ARRAY.getType()) {
            return "boolean";
        } else if (type == Type.CHARACTER.getType()) {
            return "char";
        } else if (type == Type.CHARACTER_ARRAY.getType()) {
            return "char";
        } else if (type == Type.INTEGER.getType()) {
            return "int";
        } else if (type == Type.INTEGER_ARRAY.getType()) {
            return "int";
        } else if (type == Type.STRING.getType()) {
            return "java/lang/String";
        } else if (type == Type.STRING_ARRAY.getType()) {
            return "java/lang/String";
        }else if (type == Type.VOID.getType()) {
            return VOIDJAVA;
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    public String getPrefix() {
        if (type == Type.BOOLEAN.getType()) {
            return "b";
        } else if (type == Type.BOOLEAN_ARRAY.getType()) {
            return "b";
        } else if (type == Type.CHARACTER.getType()) {
            return "c";
        } else if (type == Type.CHARACTER_ARRAY.getType()) {
            return "c";
        } else if (type == Type.INTEGER.getType()) {
            return "i";
        } else if (type == Type.INTEGER_ARRAY.getType()) {
            return "i";
        } else if (type == Type.STRING.getType()) {
            return "a";
        } else if (type == Type.STRING_ARRAY.getType()) {
            return "a";
        }else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    public Type getPrimitiveType() {
        if (type == Type.BOOLEAN_ARRAY.getType()) {
            return Type.BOOLEAN;
        } else if (type == Type.CHARACTER_ARRAY.getType()) {
            return Type.CHARACTER;
        } else if (type == Type.INTEGER_ARRAY.getType()) {
            return Type.INTEGER;
        } else if (type == Type.STRING_ARRAY.getType()) {
            return Type.STRING;
        } else{
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }
}
