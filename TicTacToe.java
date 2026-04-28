 UC7-Computer-makes-a-random-move
import java.util.Random;

public class TicTacToe {

    // Board initialization
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    // UC7: Computer makes a random valid move
    static void computerMove() {
        Random random = new Random();
        int slot;

        while (true) {
            // Generate random number between 1 and 9
            slot = random.nextInt(9) + 1;

            // Convert slot to row and column
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Check if the position is empty
            if (board[row][col] == ' ') {
                board[row][col] = computerSymbol;
                System.out.println("Computer placed at slot: " + slot);
                break;
            }
        }
    }

    // Utility to print the board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
    }
} 

 UC6-Place-move-on-Board
public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        placeMove(0, 0, 'X');  // correct method call
        System.out.println(board[0][0]); // should print X
    }

    // Places symbol on board at given row and column
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}

 UC9--Check-Winning-Condition
 public class TicTacToe {

    static char[][] board = {
        {'X', 'X', 'X'},
        {'O', ' ', 'O'},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        System.out.println(hasWon('X')); // Test case
    }

    // UC9: Check if given player has won
    static boolean hasWon(char symbol) {

        // Check rows and columns
        for (int i = 0; i < 3; i++) {

            // Row check
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }

            // Column check
            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {
                return true;
            }
        }

        // Diagonal checks
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        // No win found
        return false;
    }
}
public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Simulate a full board (no empty cells)
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = 'X';
            }
        }

        System.out.println(isDraw());
    }

    // UC10: Check if game is a draw
    static boolean isDraw() {

        // Traverse board for empty cells
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {

                // If any cell is empty → not a draw
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return 
         main
