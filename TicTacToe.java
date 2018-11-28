
public class TicTacToe {
	
	static char[][] board = {{' ',' ',' '},
			{' ',' ',' '},
			{' ',' ',' '}};
	
	static int round = 0;
	
	public static void main(String[] args) {
		System.out.println(checkWin());
		printBoard(board);
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
	
	static boolean checkWin() {
		if (round < 5)
			return false;
		else
			return true;
					
	}
}
