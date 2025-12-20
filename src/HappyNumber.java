import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	public boolean isHappy(int n) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		while (n != 1 && !set.contains(n)) {
	        set.add(n);
	        n = sumOfSquares(n);
	    }

	    return n == 1;
    }
	
	private int sumOfSquares(int n) {
	    int sum = 0;
	    while (n > 0) {
	        int digit = n % 10;
	        sum += digit * digit;
	        n /= 10;
	    }
	    return sum;
	}

	public static void main(String[] args) {
		var hn = new HappyNumber();
		System.out.println(hn.isHappy(1));

	}

}
