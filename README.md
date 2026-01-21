TIC TAC TOE GAME – JAVA (COMMAND LINE, 3x3)

This project is a command-line based Tic Tac Toe game developed using the Java programming language. The game allows two players to play against each other on a 3x3 grid using the symbols X and O. The entire game runs in the terminal and provides a simple, clear, and interactive interface for players to input their moves and view the current state of the board after each turn.

The purpose of this project is to demonstrate fundamental Java programming concepts such as arrays, loops, conditional statements, input handling using the Scanner class, and basic game logic. This project is suitable for beginners and is commonly given as a college-level or introductory Java assignment.

GAME DESCRIPTION AND RULES

The game is played on a 3x3 board. There are two players in the game. Player 1 uses the symbol X and Player 2 uses the symbol O. At the start of the game, both players are asked to enter their names. Player 1 always starts the game.

Players take turns placing their symbol on the board. On each turn, the current player must enter two numbers representing the row and column where they want to place their symbol. The valid values for both row and column are from 0 to 2.

If a player enters an invalid position, such as a row or column outside the allowed range or a cell that is already occupied, the program displays an error message and asks the player to try again. This ensures that the game always remains in a valid state.

After every valid move, the board is displayed again so that both players can see the updated game state.

WIN AND DRAW CONDITIONS

After each move, the game checks whether the current player has won. A player wins if they place three of their symbols in any one of the following ways:
- All three symbols in the same row
- All three symbols in the same column
- All three symbols along the main diagonal
- All three symbols along the anti-diagonal

If all nine cells of the board are filled and no player has met the winning condition, the game is declared a draw.

REPLAY FUNCTIONALITY

Once the game ends, either by a win or a draw, the players are asked whether they want to play again. If they choose yes, the board is reset and a new game starts. If they choose no, the program terminates gracefully.

TECHNOLOGIES USED

This project is implemented using the Java programming language. It requires Java Development Kit (JDK) version 8 or higher. No external libraries are used, and the program runs entirely in the command-line environment.

PROJECT STRUCTURE

The project consists of the following files:

TicTacToe.java  
This file contains the complete source code of the Tic Tac Toe game. It includes the logic for board creation, displaying the board, handling player input, validating moves, checking win and draw conditions, switching player turns, and replay functionality.

README.md  
This file contains documentation explaining the project, its rules, how it works, and how to compile and run the program.

HOW TO COMPILE AND RUN THE PROGRAM

To run this project, ensure that Java is installed on your system and properly configured in the system path. Open a terminal or command prompt and navigate to the directory containing the TicTacToe.java file.

Compile the program using the following command:

javac TicTacToe.java

After successful compilation, run the program using the following command:

java TicTacToe

The game will then start in the terminal and prompt players for their names and moves.

FEATURES OF THE PROJECT

The Tic Tac Toe game includes the following features:
- Interactive two-player gameplay
- 3x3 grid with row and column indexing
- Input validation for incorrect or invalid moves
- Clear and readable board display after each move
- Automatic win detection
- Draw detection when the board is full
- Replay option after game completion
- Simple and clean console-based user interface
