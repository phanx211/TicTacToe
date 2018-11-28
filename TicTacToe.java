import java.util.*;

public class TicTacToe {

	static char[][] board = {{' ',' ',' '},
			{' ',' ',' '},
			{' ',' ',' '}};

	static int round = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(checkWin());
		printBoard(board);
		while (!checkWin()) {
			round++;
			if (round % 2 == 0) {
                System.out.print("Select your space O: ");
            } else {
                System.out.print("Select your space X: ");
            }

			String coord = scanner.next();
			System.out.println();
			ParseCoord(coord);
			if (CheckWinner()) {
			    printBoard(board);
			    if (round % 2 == 0) {
                    System.out.println("Congratulations! O wins!");
                } else {
                    System.out.println("Congratulations! X wins!");
                }

				break;
			}
			printBoard(board);
		}
	}

	static void printBoard(char[][] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

	static void ParseCoord(String coord) {
	    try {
            String[] split = coord.split(",");
            int x = Integer.parseInt(split[0]);

            if (Integer.parseInt((split[0])) < 0 || Integer.parseInt(split[0]) > 2 || Integer.parseInt(split[1]) < 0 || Integer.parseInt(split[1]) > 2) {
                round--;
                System.out.println("Incorrect format. Enter input as \"x,y\" where 0 <= x,y < 3");
            } else if (board[Integer.parseInt(split[0])][Integer.parseInt(split[1])] != ' ') {
                round--;
                System.out.println("Space taken.. Try again: ");
            } else {
                if (round % 2 == 0) {
                    board[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = 'O';
                } else {
                    board[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = 'X';
                }
            }
        } catch (Exception e) {
            round--;
            System.out.println("Incorrect format. Enter input as \"x,y\" where x,y are integers: ");
        }
	}

	static boolean CheckWinner() {
        if (CheckRowWinner() || CheckColumnWinner() || CheckDiagonalWinner()) {
            return true;
        }
		return false;
	}

	static boolean CheckRowWinner() {
	    for (int i = 0; i < 3; i++) {
	        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
	            return true;
            }
        }
	    return false;
    }

	static boolean CheckColumnWinner() {
		if ((board[0][0] == 'X') && (board[1][0] == 'X') && (board[2][0] == 'X')) {
			return true;
		}
		else if ((board[0][0] == 'O') && (board[1][0] == 'O') && (board[2][0] == 'O')) {
			return true;
		}
		else if ((board[0][1] == 'X') && (board[1][1] == 'X') && (board[2][1] == 'X')) {
			return true;
		}
		else if ((board[0][1] == 'O') && (board[1][1] == 'O') && (board[2][1] == 'O')) {
			return true;
		}
		else if ((board[0][2] == 'X') && (board[1][2] == 'X') && (board[2][2] == 'X')) {
			return true;
		}
		else if ((board[0][2] == 'O') && (board[1][2] == 'O') && (board[2][2] == 'O')) {
			return true;
		}
		else {
			return false;
		}
	}

	static boolean CheckDiagonalWinner() {
		if ((board[0][0] == 'X') && (board[1][1] == 'X') && (board[2][2] == 'X')) {
			return true;
		}
		else if ((board[0][0] == 'O') && (board[1][1] == 'O') && (board[2][2] == 'O')) {
			return true;
		}
		else if ((board[0][3] == 'X') && (board[1][1] == 'X') && (board[2][0] == 'X')) {
			return true;
		}
		else if ((board[0][3] == 'O') && (board[1][1] == 'O') && (board[2][0] == 'O')) {
			return true;
		}
		else {
			return false;
		}
	}

	static boolean checkWin() {
		if (round < 5)
			return false;
		else
			return true;

	}
}
