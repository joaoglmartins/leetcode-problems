
public class RomanInteger {
	
	public int romanToInt(String s) {
	    int n = s.length();
	    int total = 0;

	    for (int i = 0; i < n; i++) {

	        int currentValue = getValue(s.charAt(i));
	        if (i + 1 < n) {
	            int nextValue = getValue(s.charAt(i + 1));

	            if (currentValue < nextValue) {
	                total -= currentValue;
	            } else {
	                total += currentValue;
	            }

	        } else {
	            total += currentValue;
	        }
	    }

	    return total;
	}

	private int getValue(char c) {
	    if (c == 'I') return 1;
	    if (c == 'V') return 5;
	    if (c == 'X') return 10;
	    if (c == 'L') return 50;
	    if (c == 'C') return 100;
	    if (c == 'D') return 500;
	    if (c == 'M') return 1000;
	    return 0;
	}


	public static void main(String[] args) {
		var ri = new RomanInteger();
		System.out.println(ri.romanToInt("IV"));
	}

}
