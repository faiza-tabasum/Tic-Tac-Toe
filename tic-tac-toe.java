import java.util.Scanner;

public class TicTacToe {

    static final int SIZE = 5;
    static char[][] board = new char[SIZE][SIZE];
    static Scanner sc = new Scanner(System.in);

    static String player1;
    static String player2;
    static char currentSymbol;
    static String currentPlayer;

    public static void main(String[] args) {

        System.out.print("Enter Player 1 name (X): ");
        player1 = sc.nextLine();

        System.out.print("Enter Player 2 name (O): ");
        player2 = sc.nextLine();

        boolean playAgain;
        do {
            initializeBoard();
            currentPlayer = player1;
            currentSymbol = 'X';

            System.out.println("\nGame started between " + player1 + " and " + player2);

            playGame();
            playAgain = askReplay();

        } while (playAgain);

        System.out.println("Game Over. Thanks for playing!");
    }

    // Initialize empty board
    static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    static void playGame() {
        int moves = 0;

        while (true) {
            printBoard();
            System.out.println(currentPlayer + "'s turn to play");

            int row = sc.nextInt();
            int col = sc.nextInt();

            if (!isValidMove(row, col)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentSymbol;
            moves++;

            if (checkWin(row, col)) {
                printBoard();
                System.out.println("🎉 " + currentPlayer + " wins!");
                return;
            }

            if (moves == SIZE * SIZE) {
                printBoard();
                System.out.println("It's a DRAW!");
                return;
            }

            switchPlayer();
        }
    }

    static boolean isValidMove(int r, int c) {
        return r >= 0 && r < SIZE &&
               c >= 0 && c < SIZE &&
               board[r][c] == ' ';
    }

    static void switchPlayer() {
        if (currentSymbol == 'X') {
            currentSymbol = 'O';
            currentPlayer = player2;
        } else {
            currentSymbol = 'X';
            currentPlayer = player1;
        }
    }

    // Print board EXACTLY like reference
    static void printBoard() {
        System.out.println("\nCurrent Board:");
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    // Check 5 in a row
    static boolean checkWin(int r, int c) {
        return checkRow(r) || checkColumn(c) ||
               (r == c && checkMainDiagonal()) ||
               (r + c == SIZE - 1 && checkAntiDiagonal());
    }

    static boolean checkRow(int r) {
        for (int c = 0; c < SIZE; c++) {
            if (board[r][c] != currentSymbol)
                return false;
        }
        return true;
    }

    static boolean checkColumn(int c) {
        for (int r = 0; r < SIZE; r++) {
            if (board[r][c] != currentSymbol)
                return false;
        }
        return true;
    }

    static boolean checkMainDiagonal() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != currentSymbol)
                return false;
        }
        return true;
    }

    static boolean checkAntiDiagonal() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][SIZE - 1 - i] != currentSymbol)
                return false;
        }
        return true;
    }

    static boolean askReplay() {
        System.out.print("Play again? (y/n): ");
        char ch = sc.next().toLowerCase().charAt(0);
        sc.nextLine();
        return ch == 'y';
    }
}
