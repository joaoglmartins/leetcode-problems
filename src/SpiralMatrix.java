import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {

	    int rows = matrix.length;
	    int cols = matrix[0].length;

	    List<Integer> result = new ArrayList<>();

	    int top = 0;
	    int bottom = rows - 1;
	    int left = 0;
	    int right = cols - 1;

	    while (top <= bottom && left <= right) {

	        for (int col = left; col <= right; col++) {
	            result.add(matrix[top][col]);
	        }
	        top++;

	        for (int row = top; row <= bottom; row++) {
	            result.add(matrix[row][right]);
	        }
	        right--;

	        if (top <= bottom) {
	            for (int col = right; col >= left; col--) {
	                result.add(matrix[bottom][col]);
	            }
	            bottom--;
	        }

	        if (left <= right) {
	            for (int row = bottom; row >= top; row--) {
	                result.add(matrix[row][left]);
	            }
	            left++;
	        }
	    }

	    return result;
	}


	public static void main(String[] args) {
		var sm = new SpiralMatrix();
		var res = sm.spiralOrder(new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		});
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (Integer i : res) {
			s.append(i + ",");
		}
		s.delete(s.length() - 1, s.length());
		s.append("]");
		System.out.println(s);

	}

}
