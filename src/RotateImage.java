
public class RotateImage {
	
	public void rotate(int[][] matrix) {
	    int n = matrix.length;

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	        }
	    }

	    for (int i = 0; i < n; i++) {
	        int left = 0;
	        int right = n - 1;

	        while (left < right) {
	            int temp = matrix[i][left];
	            matrix[i][left] = matrix[i][right];
	            matrix[i][right] = temp;

	            left++;
	            right--;
	        }
	    }
	}

	public static void main(String[] args) {
		var ri = new RotateImage();
		ri.rotate(new int[][] {
			{5,1,9,11},
			{2,4,8,10},
			{13,3,6,7},
			{15,14,12,16}
		});

	}

}
