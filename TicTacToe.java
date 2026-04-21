import java.util.Scanner;

public class TicTacToe {

 UC4-Convert-Slot-Number-to-Board-index
   
 UC3-Accept-User-Slot-Input
    static Scanner scanner = new Scanner(System.in);

    // UC3: Get user slot input
    public static int getUserInput() {
        int slot;

        while (true) {
            System.out.print("Enter a slot (1-9): ");

            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();

                if (slot >= 1 && slot <= 9) {
                    return slot; // valid input
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // clear invalid input
            }
 main
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
 UC4-Convert-Slot-Number-to-Board-in  
 main
        }

        return true;
    }

    public static void main(String[] args) {
 UC4-Convert-Slot-Number-to-Board-index

        int row = 1;

UC3-Accept-User-Slot-Input
        int userMove = getUserInput();
        System.out.println("You selected slot: " + userMove);

      int row = 1;
 main
        int col = 1;

        if (isValidMove(row, col)) {
            System.out.println("Valid move");
        } else {
            System.out.println("Invalid move");
        }
 UC4-Convert-Slot-Number-to-Board-index
   main
    }
}
