
public class RemoveDuplicatesSortedArrayII {
	
	public int removeDuplicates(int[] nums) {
		//Solution https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
//		if (nums.length <= 2) return nums.length;
//		
//		int slow = 2;
//
//        for (int fast = 2; fast < nums.length; fast++) {
//            if (nums[fast] != nums[slow - 2]) {
//            	nums[slow] = nums[fast];
//                slow++;
//            }
//        }
//
//        return slow;
		var rd = new RemoveDuplicatesHelper();
		return rd.remove(nums, 2);
    }

	public static void main(String[] args) {
		var rd = new RemoveDuplicatesSortedArrayII();
		rd.removeDuplicates(new int[] {1,1,1,2,2,3});

	}

}

