import java.util.Arrays;

public class GameOfLife {
	
	public void gameOfLife(int[][] board) {
		int rows = board.length;
		int cols = board[0].length;
        int[][] copy = Arrays.stream(board)
                .map(int[]::clone)
                .toArray(int[][]::new);
        
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < cols; j++) {
        		int liveNbr = 0;
        		boolean isAlive = copy[i][j] == 1; 
        		
        		if (i != 0 && j !=0) {
        			liveNbr += copy[i-1][j-1] == 1 ? 1 : 0;
        		}
        		
        		if (i < rows-1 && j < cols-1) {
        			liveNbr += copy[i+1][j+1] == 1 ? 1 : 0;
        		}
        		
        		if (i != 0 && j < cols-1) {
        			liveNbr += copy[i-1][j+1] == 1 ? 1 : 0;
        		}
        		
        		if (i < rows-1 && j != 0) {
        			liveNbr += copy[i+1][j-1] == 1 ? 1 : 0;
        		}
        		
        		if (i != 0) {
        			liveNbr += copy[i-1][j] == 1 ? 1 : 0;
        		}
        		
        		if (j != 0) {
        			liveNbr += copy[i][j-1] == 1 ? 1 : 0;
        		}
        		
        		if (i < rows-1) {
        			liveNbr += copy[i+1][j] == 1 ? 1 : 0;
        		}
        		
        		if (j < cols-1) {
        			liveNbr += copy[i][j+1] == 1 ? 1 : 0;
        		}
        		
        		if (liveNbr < 2) {
        			board[i][j] = 0;
        			continue;
        		}
        		
        		if (liveNbr < 4) {
        			if (!isAlive) {
        				board[i][j] = liveNbr == 3 ? 1 : 0;
        			} else {
        				board[i][j] = 1;
        			}
        			continue;
        		}
        		
        		board[i][j] = 0;
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
