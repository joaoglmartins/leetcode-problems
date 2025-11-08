
public class RemoveDuplicatesII {
	
	public int removeDuplicates(int[] nums) {
		if (nums.length <= 2) return nums.length;
		
		int slow = 2;

        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 2]) {
            	nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }

	public static void main(String[] args) {
		var rd = new RemoveDuplicatesII();
		rd.removeDuplicates(new int[] {1,1,1,2,2,3});

	}

}

