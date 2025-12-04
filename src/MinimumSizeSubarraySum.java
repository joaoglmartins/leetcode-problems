public class MinimumSizeSubarraySum {
	
	public int minSubArrayLen(int target, int[] nums) {

	    int left = 0;
	    int sum = 0;
	    int minLength = Integer.MAX_VALUE;

	    for (int right = 0; right < nums.length; right++) {

	        sum += nums[right];

	        while (sum >= target) {
	            int currentLength = right - left + 1;
	            if (currentLength < minLength) {
	                minLength = currentLength;
	            }

	            sum -= nums[left];
	            left++;
	        }
	    }

	    if (minLength == Integer.MAX_VALUE) return 0;

	    return minLength;
	}


	public static void main(String[] args) {
		var msal = new MinimumSizeSubarraySum();
		System.out.println(msal.minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
	}

}
