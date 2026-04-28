import java.util.Scanner;

public class TicTacToeGame {
uc5-validate-move

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // Display board
    static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Validate move
    static boolean validateMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid Move: Enter values 0 to 2 only.");
            return false;
        }

        if (board[row][col] != ' ') {
            System.out.println("Invalid Move: Cell already occupied.");
            return false;
        }

        return true;
    }

    // UC6 Place Move on Board
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayBoard();

        System.out.print("Enter Row (0-2): ");
        int row = sc.nextInt();

        System.out.print("Enter Column (0-2): ");
        int col = sc.nextInt();

        char playerSymbol = 'X';

        if (validateMove(row, col)) {
            placeMove(row, col, playerSymbol);
            System.out.println("Move Placed Successfully!");
        } else {
            System.out.println("Move Rejected!");
        }

        displayBoard();

        sc.close();
    }
}

    
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
} 
      main
