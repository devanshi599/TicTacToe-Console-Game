import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    // Display Board
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
        return row >= 0 && row <= 2 &&
               col >= 0 && col <= 2 &&
               board[row][col] == ' ';
    }

    // Place move
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Player move
    static void playerMove() {
        int row, col;

        while (true) {
            System.out.print("Enter Row (0-2): ");
            row = sc.nextInt();

            System.out.print("Enter Column (0-2): ");
            col = sc.nextInt();

            if (validateMove(row, col)) {
                placeMove(row, col, 'X');
                break;
            } else {
                System.out.println("Invalid Move! Try again.");
            }
        }
    }

    // Computer move
    static void computerMove() {
        int slot, row, col;

        while (true) {
            slot = random.nextInt(9) + 1;

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (validateMove(row, col)) {
                placeMove(row, col, 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    // UC9 Check Winning Condition
    static boolean checkWinner(char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol)
                return true;
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol)
                return true;
        }

        // Check diagonals
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol)
            return true;

        return false;
    }

    // Check draw
    static boolean checkDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;

        return true;
    }

    public static void main(String[] args) {

        boolean gameOver = false;
        char turn = 'X';

        while (!gameOver) {

            displayBoard();

            if (turn == 'X') {
                System.out.println("Player Turn");
                playerMove();

                if (checkWinner('X')) {
                    displayBoard();
                    System.out.println("Player Wins!");
                    gameOver = true;
                } else {
                    turn = 'O';
                }

            } else {

                System.out.println("Computer Turn");
                computerMove();

                if (checkWinner('O')) {
                    displayBoard();
                    System.out.println("Computer Wins!");
                    gameOver = true;
                } else {
                    turn = 'X';
                }
            }

            if (!gameOver && checkDraw()) {
                displayBoard();
                System.out.println("Match Draw!");
                gameOver = true;
            }
        }

        sc.close();
    }
}
