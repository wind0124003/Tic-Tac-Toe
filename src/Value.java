public enum Value {
    X("X",1),
    O("O",-1),
    EMPTY(" ",0);

    private final String symbol;
    private final int value;

    Value(String name,int value) {
        this.symbol = name;
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }
}
