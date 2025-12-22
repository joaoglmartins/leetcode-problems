import java.util.Arrays;

public class LongestConsecutiveSequence {
	
	public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int best = 1;
        int curr = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
                
            if (nums[i] == nums[i - 1] + 1) {
                curr++;
            } else {
                best = Math.max(best, curr);
                curr = 1;
            }
        }
        return Math.max(best, curr);
    }

	public static void main(String[] args) {
		var lcs = new LongestConsecutiveSequence();
		System.out.println(lcs.longestConsecutive(new int[] {100,4,200,1,3,2}));

	}

}
