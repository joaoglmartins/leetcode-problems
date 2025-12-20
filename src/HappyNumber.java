import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	public boolean isHappy(int n) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		while (!set.contains(n)) {
			set.add(n);
			
			String number = Integer.toString(n);
			
			n = 0;
			for (int i = 0; i < number.length(); i++) {
				n += Math.pow(Integer.parseInt(number.charAt(i) + ""), 2);
			}
			
			if (n == 1) return true;
		}
		
		return false;
    }

	public static void main(String[] args) {
		var hn = new HappyNumber();
		System.out.println(hn.isHappy(1));

	}

}
