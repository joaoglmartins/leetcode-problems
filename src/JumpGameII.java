public class JumpGameII {
	
	public int jump(int[] nums) {
		int jumps = 0;
	    int currentEnd = 0;
	    int furthest = 0;

	    for (int i = 0; i < nums.length - 1; i++) {
	        furthest = Math.max(furthest, i + nums[i]);

	        if (i == currentEnd) {
	            jumps++;
	            currentEnd = furthest;
	        }
	    }
	    return jumps;
    }

	public static void main(String[] args) {
		var jg = new JumpGameII();
		System.out.println(jg.jump(new int[] {2,3,1,1,4}));

	}

}
