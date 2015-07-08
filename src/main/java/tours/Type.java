package tours;

import tours.grammar.ToursParser;

import java.util.Arrays;
import java.util.List;

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

    private final int type;
    private final List<String> properties;

    private Type(int type) {
        this.type = type;

        if (type == ToursParser.BOOLEAN) {
            properties = Arrays.asList("boolean", BOOLEAN_JAVA, null, "i", null, "boolean[]");
        } else if (type == ToursParser.BOOLEAN_ARRAY) {
            properties = Arrays.asList("boolean[]", BOOLEAN_ARRAY_JAVA, "boolean", "b", "boolean", null);
        } else if (type == ToursParser.CHARACTER) {
            properties = Arrays.asList("character", CHARACTER_JAVA, null, "i", null, "character[]");
        } else if (type == ToursParser.CHARACTER_ARRAY) {
            properties = Arrays.asList("character[]", CHARACTER_ARRAY_JAVA, "char", "c", "character", null);
        } else if (type == ToursParser.INTEGER) {
            properties = Arrays.asList("integer", INTEGER_JAVA, null, "i", null, "integer[]");
        } else if (type == ToursParser.INTEGER_ARRAY) {
            properties = Arrays.asList("integer[]", INTEGER_ARRAY_JAVA, "int", "i", "integer", null);
        } else if (type == ToursParser.STRING) {
            properties = Arrays.asList("string", STRING_JAVA, null, "a", null, "string[]");
        } else if (type == ToursParser.STRING_ARRAY) {
            properties = Arrays.asList("string[]", STRING_ARRAY_JAVA, "java/lang/String", "a", "string", null);
        } else if (type == ToursParser.VOID) {
            properties = Arrays.asList("void", VOID_JAVA, null, null, null, null);
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    public Type(String type) {
        this(stringToIntType(type));
    }

    /**
     * Returns the integer representation of a type
     * @param type the string representation fo a type
     * @return the integer representation of a type
     */
    public static int stringToIntType(String type) {
        if (type.equals(Type.BOOLEAN.toString())) {
            return ToursParser.BOOLEAN;
        } else if (type.equals(Type.BOOLEAN_ARRAY.toString())) {
            return ToursParser.BOOLEAN_ARRAY;
        } else if (type.equals(Type.CHARACTER.toString())) {
            return ToursParser.CHARACTER;
        } else if (type.equals(Type.CHARACTER_ARRAY.toString())) {
            return ToursParser.CHARACTER_ARRAY;
        } else if (type.equals(Type.INTEGER.toString())) {
            return ToursParser.INTEGER;
        } else if (type.equals(Type.INTEGER_ARRAY.toString())) {
            return ToursParser.INTEGER_ARRAY;
        } else if (type.equals(Type.STRING.toString())) {
            return ToursParser.STRING;
        } else if (type.equals(Type.STRING_ARRAY.toString())) {
            return ToursParser.STRING_ARRAY;
        } else if (type.equals(Type.VOID.toString())) {
            return ToursParser.VOID;
        } else {
            throw new UnsupportedOperationException("Type: " + type + " was undefined");
        }
    }

    /**
     * Returns the integer representation of the current type
     * @return the integer representation
     */
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
        return properties.get(0);
    }

    /**
     * Returns the string representation of java object type of the Type
     * @return the java object type
     */
    public String getJavaObjectType() {
        return properties.get(1);
    }

    /**
     * Returns the string representation of the array type of an array type
     * required to build new arrays in Java bytecode
     * @return if type is array type, its string representation type, else null
     */
    public String getNewArrayType() {
        return properties.get(2);
    }

    /**
     * Returns the Java bytecode prefix of Type
     * @return the Java bytecode prefix
     */
    public String getPrefix() {
        return properties.get(3);
    }

    /**
     * Returns the string representation of the primitive type of an array type
     * @return if type is array type, its primitive type, else null
     */
    public String getPrimitiveType() {
        return properties.get(4);
    }


    /**
     * Returns the string representation of the array type of a primitive type
     * @return if type is primitive type, its array type, else null
     */
    public String getArrayType() {
        return properties.get(5);
    }

}
