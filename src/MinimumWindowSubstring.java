
public class MinimumWindowSubstring {
	
	public String minWindow(String s, String t) {

	    int[] need = new int[128];
	    int required = 0;

	    for (char c : t.toCharArray()) {
	        if (need[c] == 0) required++;
	        need[c]++;
	    }

	    int[] have = new int[128];
	    int formed = 0;

	    int left = 0, right = 0;
	    int minLength = Integer.MAX_VALUE;
	    int startIndex = 0;

	    while (right < s.length()) {

	        char cRight = s.charAt(right);
	        have[cRight]++;

	        if (have[cRight] == need[cRight]) {
	            formed++;
	        }

	        while (formed == required) {

	            int windowLength = right - left + 1;

	            if (windowLength < minLength) {
	                minLength = windowLength;
	                startIndex = left;
	            }

	            char cLeft = s.charAt(left);
	            have[cLeft]--;

	            if (have[cLeft] < need[cLeft]) {
	                formed--;
	            }

	            left++;
	        }

	        right++;
	    }

	    if (minLength == Integer.MAX_VALUE) return "";

	    return s.substring(startIndex, startIndex + minLength);
	}


	public static void main(String[] args) {
		var mws = new MinimumWindowSubstring();
		System.out.println(mws.minWindow("ADOBECODEBANC", "ABC"));
	}

}
