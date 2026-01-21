import java.util.Scanner;

/*
 * Command Line Tic Tac Toe Game (3x3)
 * Two players play alternately using X and O
 */
public class TicTacToe {

    // Size of the board
    static final int SIZE = 3;

    // 3x3 board to store game state
    static char[][] board = new char[SIZE][SIZE];

    // Scanner object for user input
    static Scanner sc = new Scanner(System.in);

    // Player names and symbols
    static String player1;
    static String player2;
    static String currentPlayer;
    static char currentSymbol;

    public static void main(String[] args) {

        // Take player names
        System.out.print("Enter Player 1 name (X): ");
        player1 = sc.nextLine();

        System.out.print("Enter Player 2 name (O): ");
        player2 = sc.nextLine();

        boolean playAgain;

        // Loop to allow replay
        do {
            initializeBoard();           // Reset board
            currentPlayer = player1;     // Player 1 starts
            currentSymbol = 'X';

            System.out.println("\nGame started between " + player1 + " and " + player2);

            playGame();                  // Start game
            playAgain = askReplay();     // Ask for replay

        } while (playAgain);

        System.out.println("Game Over. Thanks for playing!");
    }

    // Initializes the board with empty spaces
    static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Main game loop
    static void playGame() {
        int moves = 0;   // Count number of moves

        while (true) {
            printBoard();   // Display board

            // Ask current player for input
            System.out.println(currentPlayer + "'s turn to play");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Validate move
            if (!isValidMove(row, col)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            // Place symbol on board
            board[row][col] = currentSymbol;
            moves++;

            // Check for win
            if (checkWin()) {
                printBoard();
                System.out.println(currentPlayer + " wins!");
                return;
            }

            // Check for draw
            if (moves == SIZE * SIZE) {
                printBoard();
                System.out.println("It's a DRAW!");
                return;
            }

            // Switch to other player
            switchPlayer();
        }
    }

    // Checks if the move is within bounds and cell is empty
    static boolean isValidMove(int r, int c) {
        return r >= 0 && r < SIZE &&
               c >= 0 && c < SIZE &&
               board[r][c] == ' ';
    }

    // Switch current player and symbol
    static void switchPlayer() {
        if (currentSymbol == 'X') {
            currentSymbol = 'O';
            currentPlayer = player2;
        } else {
            currentSymbol = 'X';
            currentPlayer = player1;
        }
    }

    // Prints the current board with row and column indexes
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

    // Check all winning conditions
    static boolean checkWin() {

        // Check rows
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentSymbol &&
                board[i][1] == currentSymbol &&
                board[i][2] == currentSymbol) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] == currentSymbol &&
                board[1][i] == currentSymbol &&
                board[2][i] == currentSymbol) {
                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == currentSymbol &&
            board[1][1] == currentSymbol &&
            board[2][2] == currentSymbol) {
            return true;
        }

        // Check anti-diagonal
        if (board[0][2] == currentSymbol &&
            board[1][1] == currentSymbol &&
            board[2][0] == currentSymbol) {
            return true;
        }

        return false;
    }

    // Ask players if they want to replay
    static boolean askReplay() {
        System.out.print("Play again? (y/n): ");
        char choice = sc.next().toLowerCase().charAt(0);
        sc.nextLine(); // Clear buffer
        return choice == 'y';
    }
}
