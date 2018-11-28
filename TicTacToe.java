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
	
	static boolean checkWin() {
		if (round < 5)
			return false;
		else
			return true;
					
	}
}
