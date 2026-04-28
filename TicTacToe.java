import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char humanSymbol = 'X';
    static char computerSymbol = 'O';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Continuous game loop
        while (!gameOver) {

            printBoard();

            if (isHumanTurn) {
                System.out.println("Your turn (Enter slot 1-9): ");
                int slot = scanner.nextInt();
                makeMove(slot, humanSymbol);
            } else {
                computerMove();
            }

            // Check for win
            if (checkWin(humanSymbol)) {
                printBoard();
                System.out.println("You win!");
                gameOver = true;
            } else if (checkWin(computerSymbol)) {
                printBoard();
                System.out.println("Computer wins!");
                gameOver = true;
            }
            // Check for draw
            else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameOver = true;
            }

            // Switch turns
            isHumanTurn = !isHumanTurn;
        }

        scanner.close();
    }

    // Place move if valid
    static void makeMove(int slot, char symbol) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        if (board[row][col] == ' ') {
            board[row][col] = symbol;
        } else {
            System.out.println("Invalid move! Try again.");
            makeMove(slot, symbol); // retry (simple approach)
        }
    }

    // Computer random move (reuse UC7 logic)
    static void computerMove() {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1;
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == ' ') {
                board[row][col] = computerSymbol;
                System.out.println("Computer chose: " + slot);
                break;
            }
        }
    }

    // Check win condition
    static boolean checkWin(char symbol) {

        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    // Check if board is full
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Print board
    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
        System.out.println();
    }
} 
