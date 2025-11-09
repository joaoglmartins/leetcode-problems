import java.util.Collections;
import java.util.HashMap;

public class MajorityElement {
	
	public int majorityElement(int[] nums) {
		// Solution for https://leetcode.com/problems/majority-element
		var counter = new HashMap<Integer, Integer>();
		
		for (int num : nums) {
			counter.put(num, counter.getOrDefault(num, 0) + 1);
		}
		
		return Collections.max(counter.keySet());
    }

	public static void main(String[] args) {
		var me = new MajorityElement();
		System.out.println(me.majorityElement(new int[] {3,2,3}));

	}

}
