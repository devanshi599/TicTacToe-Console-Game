import java.util.Random;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static char playerSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        
        // UC2: Perform the toss
        toss();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // New logic for UC2: The Toss
    static void toss() {
        Random rand = new Random();
        int result = rand.nextInt(2); // Generates 0 or 1

        if (result == 0) {
            System.out.println("Toss Result: User starts first!");
            playerSymbol = 'X';
            computerSymbol = 'O';
        } else {
            System.out.println("Toss Result: Computer starts first!");
            playerSymbol = 'O';
            computerSymbol = 'X';
        }
        System.out.println("Your symbol is: " + playerSymbol);
    }
}
