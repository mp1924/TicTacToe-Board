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
