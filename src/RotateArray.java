import java.util.Arrays;

public class RotateArray {
	
	public void rotate(int[] nums, int k) {
		int n = nums.length;
	    k = k % n;
	    if (k == 0) return;

	    int count = 0;

	    for (int start = 0; count < n; start++) {
	        int current = start;
	        int number = nums[start];

	        do {
	            int newIndex = (current + k) % n;
	            int tempNumber = nums[newIndex];
	            nums[newIndex] = number;
	            number = tempNumber;
	            current = newIndex;
	            count++;
	        } while (start != current);
	    }
	    
	    System.out.println(Arrays.toString(nums));
    }

	public static void main(String[] args) {
		var ra = new RotateArray();
		ra.rotate(new int[] {3,99,-1,-100}, 2);
	}
	
}
