import java.util.Scanner;

public class TicTacToe {

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
        }
    }

    public static void main(String[] args) {
        int userMove = getUserInput();
        System.out.println("You selected slot: " + userMove);
    }
}
