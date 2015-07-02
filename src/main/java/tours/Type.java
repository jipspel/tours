package tours;

import tours.grammar.ToursParser;

public class Type {
    public static final Type BOOLEAN = new Type(ToursParser.BOOLEAN);
    public static final Type CHARACTER = new Type(ToursParser.CHARACTER);
    public static final Type INTEGER = new Type(ToursParser.INTEGER);
    public static final Type STRING = new Type(ToursParser.STRING);
    public static final Type VOID = new Type(ToursParser.VOID);

    public static final Type BOOLEANARRAY = new Type(ToursParser.BOOLEAN);
    public static final Type CHARACTERARRAY = new Type(ToursParser.CHARACTER);
    public static final Type INTEGERARRAY = new Type(ToursParser.INTEGER);
    public static final Type STRINGARRAY = new Type(ToursParser.STRING);

    public static final String BOOLEANJAVA = "Z";
    public static final String CHARACTERJAVA = "C";
    public static final String INTEGERJAVA = "I";
    public static final String STRINGJAVA = "Ljava/lang/String;";
    public static final String VOIDJAVA = "V";

    public static final String BOOLEANARRAYJAVA = "boolean[]";
    public static final String CHARACTERARRAYJAVA = "char[]";
    public static final String INTEGERARRAYJAVA = "int[]";
    public static final String STRINGARRAYJAVA = "java/lang/String[]";

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
                this.type = BOOLEANARRAY.getType();
                break;
            case "character" :
                this.type = CHARACTER.getType();
                break;
            case "character[]" :
                this.type = CHARACTERARRAY.getType();
                break;
            case "integer" :
                this.type = INTEGER.getType();
                break;
            case "integer[]" :
                this.type = INTEGERARRAY.getType();
                break;
            case "string" :
                this.type = STRING.getType();
                break;
            case "string[]" :
                this.type = STRINGARRAY.getType();
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
        } else if (type == Type.BOOLEANARRAY.getType()) {
            return "boolean[]";
        } else if (type == Type.CHARACTERARRAY.getType()) {
            return "character[]";
        } else if (type == Type.INTEGERARRAY.getType()) {
            return "integer[]";
        } else if (type == Type.STRINGARRAY.getType()) {
            return "string[]";
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    public String getJavaObjectType() {
        if (type == Type.BOOLEAN.getType()) {
            return BOOLEANJAVA;
        } else if (type == Type.BOOLEANARRAY.getType()) {
            return BOOLEANARRAYJAVA;
        } else if (type == Type.CHARACTER.getType()) {
            return CHARACTERJAVA;
        } else if (type == Type.CHARACTERARRAY.getType()) {
            return CHARACTERARRAYJAVA;
        } else if (type == Type.INTEGER.getType()) {
            return INTEGERJAVA;
        } else if (type == Type.INTEGERARRAY.getType()) {
            return INTEGERARRAYJAVA;
        } else if (type == Type.STRING.getType()) {
            return STRINGJAVA;
        } else if (type == Type.STRINGARRAY.getType()) {
            return STRINGARRAYJAVA;
        }else if (type == Type.VOID.getType()) {
            return VOIDJAVA;
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }
}
