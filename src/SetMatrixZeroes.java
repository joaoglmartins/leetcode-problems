public class SetMatrixZeroes {
	
	public void setZeroes(int[][] matrix) {

	    int rows = matrix.length;
	    int cols = matrix[0].length;

	    boolean firstRowZero = false;
	    boolean firstColZero = false;

	    for (int j = 0; j < cols; j++) {
	        if (matrix[0][j] == 0) {
	            firstRowZero = true;
	            break;
	        }
	    }

	    for (int i = 0; i < rows; i++) {
	        if (matrix[i][0] == 0) {
	            firstColZero = true;
	            break;
	        }
	    }

	    for (int i = 1; i < rows; i++) {
	        for (int j = 1; j < cols; j++) {
	            if (matrix[i][j] == 0) {
	                matrix[i][0] = 0;
	                matrix[0][j] = 0;
	            }
	        }
	    }

	    for (int i = 1; i < rows; i++) {
	        if (matrix[i][0] == 0) {
	            for (int j = 1; j < cols; j++) {
	                matrix[i][j] = 0;
	            }
	        }
	    }

	    for (int j = 1; j < cols; j++) {
	        if (matrix[0][j] == 0) {
	            for (int i = 1; i < rows; i++) {
	                matrix[i][j] = 0;
	            }
	        }
	    }

	    if (firstRowZero) {
	        for (int j = 0; j < cols; j++) {
	            matrix[0][j] = 0;
	        }
	    }

	    if (firstColZero) {
	        for (int i = 0; i < rows; i++) {
	            matrix[i][0] = 0;
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
