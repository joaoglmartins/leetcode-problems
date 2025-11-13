
public class JumpGame {
	
	public boolean canJump(int[] nums) {
		
		Boolean[] memo = new Boolean[nums.length];
    	
    	return canJumpAux(nums, 0, memo);
    }

	private boolean canJumpAux(int[] nums, int index, Boolean[] memo) {
		
		if (index == nums.length -1) return true;
		if(nums[index] == 0) return false;
		
		if (memo[index] != null) return memo[index];
		
		int maxJumpLength = nums[index];
		
		for (int i = 1; i <= maxJumpLength; i++) {
			if (canJumpAux(nums, index + i, memo)) return memo[index] = true;
		}
		
		return memo[index] = false;
	}

	public static void main(String[] args) {
		var jg = new JumpGame();
		System.out.println(jg.canJump(new int[] {2,3,1,1,4}));

	}

}
