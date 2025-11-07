public class RemoveElement { 

	public int removeElement(int[] nums, int val) {
		//Solution for https://leetcode.com/problems/remove-element
		int k = 0;
	    
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != val) {
	            nums[k] = nums[i];
	            k++;
	        }
	    }
	    
	    return k;
    }
	
	public static void main(String[] args) {
		var re = new RemoveElement();
		re.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
	}

}
