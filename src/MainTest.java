import java.util.Scanner;

/**
 * Program description:
 * This program is a tic tac toe game. First player 's symbol is 'X' while second player 's symbol is 'O'.
 * First, it prompt the user to input location (column, row).
 * Then, it check whether the input is valid. The range of column and row should be 0-2.
 * If input is valid and inputted location is empty, it will place a symbol on the location.
 * If the location is not empty or the input is invalid, prompts an error message.
 * After placing the symbol, print the tic tac toe, check if the player win the game.
 * If the player does not win, ask next player to play.
 */
public class MainTest {
    private static TicTacToe ticTacToe = new TicTacToe();
    private static TicTacToeWinDecision ticTacToeWinDecision = new TicTacToeWinDecision(ticTacToe);
    private static int column;
    private static int row;
    private static int count = 0;
    private static Value value;

    MainTest(){
        ticTacToe = new TicTacToe();
        ticTacToeWinDecision = new TicTacToeWinDecision(ticTacToe);
    }

    /* Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ticTacToe.printTicTacToe();
        while (count <9) {
            if (count % 2 == 0) {
                value = Value.X;
            }
            else {
                value = Value.O;
            }
            System.out.print("Enter the location (column, row). ");
            if (value == Value.X) {
                System.out.println("\"X\" round!");
            } else {
                System.out.println("\"O\" round!");
            }

            System.out.print("Row: ");
            row = input.nextInt();
            System.out.print("Column: ");
            column = input.nextInt();

            if ((column >= 0 && column < 3) && (row >= 0 && row < 3)) {
                if (ticTacToe.placeSymbol(row, column,value)) {
                    count++;
                    if (ticTacToeWinDecision.checkVictory(value)){
                        System.out.println(value.getSymbol() +" player is win!");
                        ticTacToe.printTicTacToe();
                        System.exit(0);
                    }
                } else
                    System.out.println("This location is not empty!");
            } else {
                System.out.println("The input is invalid. (range: 0 <= column/row <= 2)");
            }
            ticTacToe.printTicTacToe();
            System.out.println();
        }
        System.out.println("The game is finish! The players are draw!");
    }
}