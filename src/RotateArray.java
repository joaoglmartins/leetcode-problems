public class RotateArray {
	
	public void rotate(int[] nums, int k) {
		int number = nums[0];
		int tempNumber = 0;
		int newIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (newIndex + k >= nums.length) {
				newIndex = k - nums.length + newIndex;
			} else {
				newIndex = newIndex + k;
			}
			tempNumber = nums[newIndex];
			nums[newIndex] = number;
			number = tempNumber;
		}
    }

	public static void main(String[] args) {
		var ra = new RotateArray();
		ra.rotate(new int[] {3,99,-1,-100}, 2);
	}
	
}
