package tours;

import tours.grammar.ToursParser;

public class Type {
    public static final Type BOOLEAN = new Type(ToursParser.BOOLEAN, false);
    public static final Type CHARACTER = new Type(ToursParser.CHARACTER, false);
    public static final Type INTEGER = new Type(ToursParser.INTEGER, false);
    public static final Type STRING = new Type(ToursParser.STRING, false);
    public static final Type VOID = new Type(ToursParser.VOID, false);
    public static final Type BOOLEANARRAY = new Type(ToursParser.BOOLEAN, true);
    public static final Type CHARACTERARRAY = new Type(ToursParser.CHARACTER, true);
    public static final Type INTEGERARRAY = new Type(ToursParser.INTEGER, true);
    public static final Type STRINGARRAY = new Type(ToursParser.STRING, true);
    public static final Type VOIDARRAY = new Type(ToursParser.VOID, true);

    public static final String BOOLEANJAVA = "Z";
    public static final String CHARACTERJAVA = "C";
    public static final String INTEGERJAVA = "I";
    public static final String STRINGJAVA = "Ljava/lang/String;";
    public static final String VOIDJAVA = "V";

    public static final String BOOLEANJAVAARRAY = "boolean[]";
    public static final String CHARACTERJAVAARRAY = "char[]";
    public static final String INTEGERJAVAARRAY = "int[]";
    public static final String STRINGJAVAARRAY = "java/lang/String[]";

    private final int type;
    private final boolean array;

    public Type(int type, boolean array) {
        this.type = type;
        this.array = array;
    }

    public Type(String type, boolean array) {
        this.array = array;
        type = type.toLowerCase();
        switch (type) {
            case "boolean" :
                if (array) {
                    this.type = BOOLEAN.getType();
                } else {
                    this.type = BOOLEANARRAY.getType();
                }
                break;
            case "character" :
                if (array) {
                    this.type = CHARACTER.getType();
                } else {
                    this.type = CHARACTERARRAY.getType();
                }
                break;
            case "integer" :
                if (array) {
                    this.type = INTEGER.getType();
                } else {
                    this.type = INTEGERARRAY.getType();
                }
                break;
            case "string" :
                if (array) {
                    this.type = STRING.getType();
                } else {
                    this.type = STRINGARRAY.getType();
                }
                break;
            case "void" :
                if (array) {
                    throw new UnsupportedOperationException("Type: " + type + " with array was undefined");
                } else {
                    this.type = VOID.getType();
                }
                break;
            default :
                throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    public int getType() {
        return type;
    }

    public boolean isArray() {
        return array;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Type &&
                this.getType() == ((Type) object).getType() &&
                this.isArray() == ((Type) object).isArray();
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
        } else if (type == Type.CHARACTER.getType()) {
            return CHARACTERJAVA;
        } else if (type == Type.INTEGER.getType()) {
            return INTEGERJAVA;
        } else if (type == Type.STRING.getType()) {
            return STRINGJAVA;
        } else if (type == Type.VOID.getType()) {
            return VOIDJAVA;
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }
}
