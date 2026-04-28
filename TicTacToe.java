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
