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
			System.out.print("Select your space: ");
			String coord = scanner.neboardt();
			System.out.println();
			ParseCoord(coord);
			if (CheckWinner()) {
				System.out.println("Congratulations!!");
				break;
			}
			printBoard(board);
		}
	}

	static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

	static void ParseCoord(String coord) {
		String[] split = coord.split(",");
		if (round % 2 == 0) {
			board[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = 'O';
		} else {
			board[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = 'X';
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
