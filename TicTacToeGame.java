import java.util.Scanner;

public class TicTacToeGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        
        // Calling UC3 Method
        int selectedSlot = getUserSlot();
        
        System.out.println("You selected slot: " + selectedSlot);
        // Next logic: return to game logic...
    }

    /**
     * UC3: Accept User Slot Input (1-9)
     * Handles reading the integer input from the player.
     */
    public static int getUserSlot() {
        int slot = -1;
        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();
                if (slot >= 1 && slot <= 9) {
                    break;
                } else {
                    System.out.println("Invalid input. Please choose a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return slot;
    }
}