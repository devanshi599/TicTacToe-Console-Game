import java.util.Scanner;

public class TicTacToeGame {
    
    private static final int SIZE = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        
        // UC3: Get Input
        int slot = getUserSlot();
        
        // UC4: Convert to Indices
        int[] indices = convertSlotToIndices(slot);
        
        System.out.println("Slot " + slot + " maps to: Row " + indices[0] + ", Col " + indices[1]);
    }

    // UC3 Method
    public static int getUserSlot() {
        int slot = -1;
        while (true) {
            System.out.print("Enter slot (1-9): ");
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();
                if (slot >= 1 && slot <= 9) break;
            } else {
                scanner.next(); // Clear invalid input
            }
            System.out.println("Please enter a number between 1 and 9.");
        }
        return slot;
    }

    // UC4 Method
    public static int[] convertSlotToIndices(int slot) {
        int adjustedSlot = slot - 1;
        int row = adjustedSlot / SIZE;
        int col = adjustedSlot % SIZE;
        return new int[]{row, col};
    }
} // <--- Check if this final brace is missing or if there is extra text after it