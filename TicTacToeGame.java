public class TicTacToeGame {
    
    // Board size constant
    private static final int SIZE = 3;

    public static void main(String[] args) {
        int slot = 5; // Example input from UC3
        
        // Calling UC4 Method
        int[] indices = convertSlotToIndices(slot);
        
        int row = indices[0];
        int col = indices[1];
        
        System.out.println("Slot " + slot + " maps to: Row " + row + ", Column " + col);
    }

    /**
     * UC4: Convert Slot Number (1-9) to Board Index (Row, Column)
     * Uses zero-based indexing and math to map the input.
     */
    public static int[] convertSlotToIndices(int slot) {
        // Step 1: Adjust to 0-8 for math purposes
        int adjustedSlot = slot - 1; 
        
        // Step 2: Calculate Row and Column
        int row = adjustedSlot / SIZE;
        int col = adjustedSlot % SIZE;
        
        return new int[]{row, col};
    }
} 