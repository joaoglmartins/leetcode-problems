import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
	
	public void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		List<Integer> rowsZero = new ArrayList<>();
		List<Integer> colsZero = new ArrayList<>();
		
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < cols; j++)  {
        		if (matrix[i][j] == 0) {
        			rowsZero.add(i);
        			colsZero.add(j);
        		}
        	}
        }
        
        for (Integer row : rowsZero) {
        	for (int k = 0; k < cols; k++) {
        		matrix[row][k] = 0;
        	}
        }
        
        for (Integer col : colsZero) {
        	for (int l = 0; l < rows; l++) {
        		matrix[l][col] = 0;
        	}
        }
        
    }

	public static void main(String[] args) {
		var smz = new SetMatrixZeroes();
		smz.setZeroes(new int[][] {
				{0,1,2,0},
				{3,4,5,2},
				{1,3,1,5}
			});
	}

}
