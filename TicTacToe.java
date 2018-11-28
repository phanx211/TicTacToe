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
			String coord = scanner.next();
			System.out.println();
			ParseCoord(coord);
			if (CheckWinner(board)) {
				System.out.println("Congratulations!!");
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
		String[] split = coord.split(",");
		if (round % 2 == 0) {
			board[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = 'O';
		} else {
			board[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = 'X';
		}
	}

	static boolean CheckWinner(char[][] x) {

		return false;
	}

	static boolean CheckRowWinner(char[][] x) {

		return false;
	}

	static boolean CheckColumnWinner(char[][] x) {
		if ((x[0][0] == 'X') && (x[1][0] == 'X') && (x[2][0] == 'X')) {
			return true;
		}
		else if ((x[0][0] == 'O') && (x[1][0] == 'O') && (x[2][0] == 'O')) {
			return true;
		}
		else if ((x[0][1] == 'X') && (x[1][1] == 'X') && (x[2][1] == 'X')) {
			return true;
		}
		else if ((x[0][1] == 'O') && (x[1][1] == 'O') && (x[2][1] == 'O')) {
			return true;
		}
		else if ((x[0][2] == 'X') && (x[1][2] == 'X') && (x[2][2] == 'X')) {
			return true;
		}
		else if ((x[0][2] == 'O') && (x[1][2] == 'O') && (x[2][2] == 'O')) {
			return true;
		}
		else {
			return false;
		}
	}

	static boolean CheckDiagonalWinner(char[][] x) {
		if ((x[0][0] == 'X') && (x[1][1] == 'X') && (x[2][2] == 'X')) {
			return true;
		}
		else if ((x[0][0] == 'O') && (x[1][1] == 'O') && (x[2][2] == 'O')) {
			return true;
		}
		else if ((x[0][3] == 'X') && (x[1][1] == 'X') && (x[2][0] == 'X')) {
			return true;
		}
		else if ((x[0][3] == 'O') && (x[1][1] == 'O') && (x[2][0] == 'O')) {
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
