public class TicTacToeWinDecision {
    private TicTacToe ticTacToe;

    public TicTacToeWinDecision(TicTacToe ticTacToe) {
        this.ticTacToe = ticTacToe;
    }

    public boolean checkVictory(Value value) {
        if (checkRow(value)) {
            return true;
        } else if (checkColumn(value)) {
            return true;
        } else if (checkDiagonal(value)) {
            return true;
        }
        return false;
    }

    public boolean checkDiagonal(Value value) {
        if ((ticTacToe.checkValue(0, 2, value)) && (ticTacToe.checkValue(1, 1, value))
                && (ticTacToe.checkValue(2, 0, value))) {
            return true;
        }
        if ((ticTacToe.checkValue(0, 0, value)) && (ticTacToe.checkValue(1, 1, value))
                && (ticTacToe.checkValue(2, 2, value))) {
            return true;
        }
        return false;
    }

    public boolean checkRow(Value value) {
        for (int row = 0; row < 3; row++) {
            if ((ticTacToe.checkValue(row, 0, value)) && (ticTacToe.checkValue(row, 1, value)) &&
                    (ticTacToe.checkValue(row, 2, value))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColumn(Value value) {
        for (int column = 0; column < 3; column++) {
            if ((ticTacToe.checkValue(0, column, value)) && (ticTacToe.checkValue(1, column, value)) &&
                    (ticTacToe.checkValue(2, column, value))) {
                return true;
            }
        } // End for loop
        return false;
    }

}
