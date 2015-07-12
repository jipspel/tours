package tours;

import tours.grammar.ToursParser;

import java.util.HashMap;
import java.util.Map;

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

    public static final String BOOLEAN_JAVA = "Z";
    public static final String CHARACTER_JAVA = "C";
    public static final String INTEGER_JAVA = "I";
    public static final String STRING_JAVA = "Ljava/lang/String;";
    public static final String VOID_JAVA = "V";

    public static final String BOOLEAN_ARRAY_JAVA = "[Z";
    public static final String CHARACTER_ARRAY_JAVA = "[C";
    public static final String INTEGER_ARRAY_JAVA = "[I";
    public static final String STRING_ARRAY_JAVA = "[Ljava/lang/String;";

    private Map<String, String> properties;
    private int type;

    private void setProperties(String... args) {
        properties = new HashMap<>();
        properties.put("toString", args[0]);
        properties.put("javaByteCodeType", args[1]);
        properties.put("javaByteCodeArrayType", args[2]);
        properties.put("javaByteCodePrefix", args[3]);
        properties.put("toPrimitive", args[4]);
        properties.put("toArray", args[5]);
    }

    private void initialize(int type) {
        this.type = type;
        if (type == ToursParser.BOOLEAN) {
            setProperties("boolean", BOOLEAN_JAVA, null, "i", null, "boolean[]");
        } else if (type == ToursParser.BOOLEAN_ARRAY) {
            setProperties("boolean[]", BOOLEAN_ARRAY_JAVA, "boolean", "b", "boolean", null);
        } else if (type == ToursParser.CHARACTER) {
            setProperties("character", CHARACTER_JAVA, null, "i", null, "character[]");
        } else if (type == ToursParser.CHARACTER_ARRAY) {
            setProperties("character[]", CHARACTER_ARRAY_JAVA, "char", "c", "character", null);
        } else if (type == ToursParser.INTEGER) {
            setProperties("integer", INTEGER_JAVA, null, "i", null, "integer[]");
        } else if (type == ToursParser.INTEGER_ARRAY) {
            setProperties("integer[]", INTEGER_ARRAY_JAVA, "int", "i", "integer", null);
        } else if (type == ToursParser.STRING) {
            setProperties("string", STRING_JAVA, null, "a", null, "string[]");
        } else if (type == ToursParser.STRING_ARRAY) {
            setProperties("string[]", STRING_ARRAY_JAVA, "java/lang/String", "a", "string", null);
        } else if (type == ToursParser.VOID) {
            setProperties("void", VOID_JAVA, null, null, null, null);
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }

    }

    private Type(int type) {
        initialize(type);
    }

    public Type(String type) {
        if (type.equals(Type.BOOLEAN.toString())) {
            initialize(ToursParser.BOOLEAN);
        } else if (type.equals(Type.BOOLEAN_ARRAY.toString())) {
            initialize(ToursParser.BOOLEAN_ARRAY);
        } else if (type.equals(Type.CHARACTER.toString())) {
            initialize(ToursParser.CHARACTER);
        } else if (type.equals(Type.CHARACTER_ARRAY.toString())) {
            initialize(ToursParser.CHARACTER_ARRAY);
        } else if (type.equals(Type.INTEGER.toString())) {
            initialize(ToursParser.INTEGER);
        } else if (type.equals(Type.INTEGER_ARRAY.toString())) {
            initialize(ToursParser.INTEGER_ARRAY);
        } else if (type.equals(Type.STRING.toString())) {
            initialize(ToursParser.STRING);
        } else if (type.equals(Type.STRING_ARRAY.toString())) {
            initialize(ToursParser.STRING_ARRAY);
        } else if (type.equals(Type.VOID.toString())) {
            initialize(ToursParser.VOID);
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Type &&
                this.type == ((Type) object).type;
    }

    @Override
    public String toString() {
        return properties.get("toString");
    }

    /**
     * Returns the string representation of java object type of the Type
     * @return the java object type
     */
    public String getJavaByteCodeType() {
        return properties.get("javaByteCodeType");
    }

    /**
     * Returns the string representation of the array type of an array type
     * required to build new arrays in Java bytecode
     * @return if type is array type, its string representation type, else null
     */
    public String getJavaByteCodeArrayType() {
        return properties.get("javaByteCodeArrayType");
    }

    /**
     * Returns the Java bytecode prefix of Type
     * @return the Java bytecode prefix
     */
    public String javaByteCodePrefix() {
        return properties.get("javaByteCodePrefix");
    }

    /**
     * Returns the string representation of the primitive type of an array type
     * @return if type is array type, its primitive type, else null
     */
    public String toPrimitive() {
        return properties.get("toPrimitive");
    }


    /**
     * Returns the string representation of the array type of a primitive type
     * @return if type is primitive type, its array type, else null
     */
    public String toArray() {
        return properties.get("toArray");
    }

}
