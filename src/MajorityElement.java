public class MajorityElement {
	
	public int majorityElement(int[] nums) {
		// Solution for https://leetcode.com/problems/majority-element
//		var counter = new HashMap<Integer, Integer>();
//		
//		for (int num : nums) {
//			counter.put(num, counter.getOrDefault(num, 0) + 1);
//		}
//		
//		return Collections.max(counter.keySet());
		int count = 0;
		int candidate = 0;
		
		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}
		
		return candidate;
    }

	public static void main(String[] args) {
		var me = new MajorityElement();
		System.out.println(me.majorityElement(new int[] {2,2,1,1,1,2,2}));

	}

}
