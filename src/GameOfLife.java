public class GameOfLife {
	
	public void gameOfLife(int[][] board) {
	    int rows = board.length;
	    int cols = board[0].length;

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {

	            int liveNbr = 0;

	            for (int x = -1; x <= 1; x++) {
	                for (int y = -1; y <= 1; y++) {
	                    if (x == 0 && y == 0) continue;

	                    int r = i + x;
	                    int c = j + y;

	                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
	                        liveNbr += board[r][c] & 1;
	                    }
	                }
	            }

	            boolean isAlive = (board[i][j] & 1) == 1;

	            if (isAlive && (liveNbr < 2 || liveNbr > 3)) {
	                board[i][j] = 2;
	            }

	            if (!isAlive && liveNbr == 3) {
	                board[i][j] = 3;
	            }
	        }
	    }

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            board[i][j] >>= 1;
	        }
	    }
	}


	public static void main(String[] args) {
		var gol = new GameOfLife();
		gol.gameOfLife(new int[][] {
			{0,1,0},
			{0,0,1},
			{1,1,1},
			{0,0,0}
		});

	}

}
