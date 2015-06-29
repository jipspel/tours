package tours.compiler;

import tours.grammar.ToursParser;

public class Type {
    public static final Type BOOLEAN = new Type(ToursParser.BOOLEAN);
    public static final Type CHARACTER = new Type(ToursParser.CHARACTER);
    public static final Type INTEGER = new Type(ToursParser.INTEGER);
    public static final Type STRING = new Type(ToursParser.STRING);
    private final int type;

    public Type(int type) {
        this.type = type;
    }
    public Type(String type) {
        switch (type) {
            case "boolean" :
                this.type = BOOLEAN.getType();
                break;
            case "character" :
                this.type = CHARACTER.getType();
                break;
            case "integer" :
                this.type = INTEGER.getType();
                break;
            case "string" :
                this.type = STRING.getType();
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
        if (object instanceof Type) {
            return this.getType() == ((Type) object).getType();
        }
        return false;
    }
}
