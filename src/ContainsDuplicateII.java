import java.util.HashMap;

public class ContainsDuplicateII {
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
            	if (i - map.get(nums[i]) <= k) {
            		return true;
            	}
            }
            
            map.put(nums[i], i);
        }
        return false;
    }

	public static void main(String[] args) {
		var cdii = new ContainsDuplicateII();
		System.out.println(cdii.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
	}

}