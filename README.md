TIC TAC TOE GAME – JAVA (COMMAND LINE)

This project is a command-line based Tic Tac Toe game developed using Java. The game allows two players to play against each other on a 5x5 grid using the symbols X and O. The application runs entirely in the terminal and provides a clear, interactive interface for players to input their moves and view the current state of the board after every turn.

The main objective of this project is to demonstrate basic Java programming concepts such as arrays, loops, conditional statements, input handling, and simple game logic. The game closely follows the reference output format provided in the problem statement, including indexed rows and columns, player turn messages, and continuous board updates.

GAME RULES AND WORKING

The game is played on a 5x5 board. There are two players. Player 1 uses the symbol X and Player 2 uses the symbol O. At the beginning of the game, both players are asked to enter their names. The game then starts and players take turns to play.

On each turn, the current player is prompted to enter two integers representing the row and column where they want to place their symbol. The valid range for both row and column values is from 0 to 4. If the entered position is outside the board limits or the selected cell is already occupied, the program displays an error message and asks the player to enter the input again.

After every valid move, the board is printed to the console showing the updated game state. The board includes row and column indices to make it easier for players to choose positions.

The game checks for a winning condition after each move. A player wins if they successfully place five of their symbols in a single row, a single column, or along either of the two diagonals. If all positions on the board are filled and no player has won, the game is declared a draw.

Once the game ends, the players are asked whether they want to play again. If they choose yes, the board is reset and a new game begins. If they choose no, the program terminates.

TECHNOLOGIES USED

The game is implemented using the Java programming language. It can be run using any Java Development Kit (JDK) version 8 or higher. The program does not require any external libraries and runs entirely on the command line.

PROJECT STRUCTURE

The project consists of the following files:

TicTacToe.java – Contains the complete source code for the game including board creation, input handling, game logic, win and draw detection, and replay functionality.

README.md – Contains documentation explaining the project, how the game works, and how to run it.

HOW TO COMPILE AND RUN THE PROGRAM

To run this program, make sure Java is installed on your system and added to the system path. Open a terminal or command prompt and navigate to the folder containing the TicTacToe.java file.

Compile the program using the following command:

javac TicTacToe.java

After successful compilation, run the program using:

java TicTacToe

The game will start in the terminal and prompt the players for their names and moves.

FEATURES

This project includes the following features:
• Interactive two-player gameplay
• 5x5 grid with row and column indices
• Input validation for incorrect or invalid moves
• Real-time board display after each turn
• Win detection for rows, columns, and diagonals
• Draw detection
• Replay option after game completion
• Clean and readable console output


