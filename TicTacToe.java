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
        return true;
    }
} 
