
public class RemoveDuplicatesHelper {
	public int remove(int[] nums, int k) {
		// General solution for the remove duplicates of leetcode
		if (nums.length <= k) return nums.length;
		
		int slow = k;

        for (int fast = k; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - k]) {
            	nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
	}
}
