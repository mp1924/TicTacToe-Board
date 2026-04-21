public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    // UC5: Validate move
    public static boolean isValidMove(int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        if (isValidMove(row, col)) {
            System.out.println("Valid move");
        } else {
            System.out.println("Invalid move");
        }
    }
}
