import java.util.Scanner;

public class TicTacToeGame {

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

    // UC5 Validate Move
    static boolean validateMove(int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid Move: Row and Column must be between 0 and 2.");
            return false;
        }

        // Check empty cell
        if (board[row][col] != ' ') {
            System.out.println("Invalid Move: Cell already occupied.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayBoard();

        System.out.print("Enter Row (0-2): ");
        int row = sc.nextInt();

        System.out.print("Enter Column (0-2): ");
        int col = sc.nextInt();

        if (validateMove(row, col)) {
            board[row][col] = 'X';
            System.out.println("Move Accepted!");
        } else {
            System.out.println("Move Rejected!");
        }

        displayBoard();

        sc.close();
    }
}