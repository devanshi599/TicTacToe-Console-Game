import java.util.Random;

public class TicTacToeGame {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    static Random random = new Random();

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
            return false;
        }

        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }

    // Place move
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC7 Computer Random Move
    static void computerMove() {

        int slot;
        int row, col;

        while (true) {

            slot = random.nextInt(9) + 1;   // 1 to 9

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (validateMove(row, col)) {
                placeMove(row, col, 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Initial Board:");
        displayBoard();

        System.out.println("Computer Turn...");
        computerMove();

        System.out.println("Updated Board:");
        displayBoard();
    }
}
