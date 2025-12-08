
public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {

	    int[][] rows = new int[9][9];
	    int[][] cols = new int[9][9];
	    int[][] boxes = new int[9][9];

	    for (int r = 0; r < 9; r++) {
	        for (int c = 0; c < 9; c++) {

	            char value = board[r][c];

	            if (value == '.') continue;

	            int digit = value - '1'; // 0–8

	            int boxIndex = (r / 3) * 3 + (c / 3);

	            if (rows[r][digit] == 1) return false;

	            if (cols[c][digit] == 1) return false;

	            if (boxes[boxIndex][digit] == 1) return false;

	            rows[r][digit] = 1;
	            cols[c][digit] = 1;
	            boxes[boxIndex][digit] = 1;
	        }
	    }

	    return true;
	}

	public static void main(String[] args) {
		var vs = new ValidSudoku();
		System.out.println(vs.isValidSudoku(new char[][] {
		    {'5','3','.','.','7','.','.','.','.'},
		    {'6','.','.','1','9','5','.','.','.'},
		    {'.','9','8','.','.','.','.','6','.'},
		    {'8','.','.','.','6','.','.','.','3'},
		    {'4','.','.','8','.','3','.','.','1'},
		    {'7','.','.','.','2','.','.','.','6'},
		    {'.','6','.','.','.','.','2','8','.'},
		    {'.','.','.','4','1','9','.','.','5'},
		    {'.','.','.','.','8','.','.','7','9'}
		}));

	}

}
