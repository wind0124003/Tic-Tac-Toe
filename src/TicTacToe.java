public class TicTacToe {
    private Value[][] ticTacToe;
    Value value;

    TicTacToe() {
        value = Value.EMPTY;
        ticTacToe = new Value[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTacToe[i][j] = value;
            }
        }
    }

    public boolean checkEmpty(int row, int column) {
        return ticTacToe[row][column] == Value.EMPTY;
    }

    /**
     * check whether the value in the parameter list is equal to the value at the tic tac toe's location [row][column]
     * @param row tic tac toe's row
     * @param column tic tac toe's column
     * @param value the value to compare
     * @return the result of checking
     */
    public boolean checkValue(int row, int column, Value value) {
        if (ticTacToe[row][column] == value) {
            return true;
        }
        return false;
    }

    /** return tic tac toe symbol at specified location [row][column]
     *
     * @param row tic tac toe's row
     * @param column tic tac toe's column
     * @return return tic tac toe symbol
     */
    public String getTicTacToeSymbol(int row, int column) {
        return ticTacToe[row][column].getSymbol();
    }

    /**
     * It places the symbol if the location of tic tac toe is empty.
     *
     * @param row    tic tac toe's row
     * @param column tic tac toe's column
     * @param symbol tic tac toe's symbol
     * @return return ture if the location of tic tac toe (row, column) is empty
     */
    public boolean placeSymbol(int row, int column, Value symbol) {
        if (checkEmpty(row, column)) {
            ticTacToe[row][column] = symbol;
            return true;
        } else {
            return false;
        }
    }

    /**
     * print tic tac toe
     */
    public void printTicTacToe() {
        // Row 0
        System.out.println(" " + getTicTacToeSymbol(0, 0) + " | " +
                getTicTacToeSymbol(0, 1) + " | " +
                getTicTacToeSymbol(0, 2));
        System.out.println("--- --- --- ");
        // Row 1
        System.out.println(" " + getTicTacToeSymbol(1, 0) + " | " +
                getTicTacToeSymbol(1, 1) + " | " +
                getTicTacToeSymbol(1, 2));
        System.out.println("--- --- --- ");
        // Row 2
        System.out.println(" " + getTicTacToeSymbol(2, 0) + " | " +
                getTicTacToeSymbol(2, 1) + " | " +
                getTicTacToeSymbol(2, 2));

    }
}
