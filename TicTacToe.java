public class TicTacToe {

    // 3x3 Character Array to represent the board
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        System.out.println("--- Welcome to Tic-Tac-Toe ---");
        initializeBoard();
        printBoard();
    }

    /**
     * UC1: Initialization Logic
     * Fills the 3x3 board with '-' to indicate empty cells.
     */
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    /**
     * UC1: Console Output Formatting
     * Prints the board using nested loops for a readable format.
     */
    static void printBoard() {
        System.out.println("Current Board Layout:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            // Move to the next line after printing all columns in a row
            System.out.println();
        }
    }
}
