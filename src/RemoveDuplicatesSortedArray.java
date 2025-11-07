public class RemoveDuplicatesSortedArray {
	
	public int removeDuplicates(int[] nums) {
		int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

	public static void main(String[] args) {
		var rd = new RemoveDuplicatesSortedArray();
		rd.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
	}

}
