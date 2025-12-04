public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {

	    int[] seen = new int[128]; // ASCII table
	    int left = 0;
	    int right = 0;
	    int max = 0;

	    while (right < s.length()) {
	        char c = s.charAt(right);

	        if (seen[c] > 0) {

	            while (s.charAt(left) != c) {
	                seen[s.charAt(left)]--;
	                left++;
	            }

	            seen[c]--;
	            left++;
	        }

	        seen[c]++;
	        int windowSize = right - left + 1;

	        if (windowSize > max) max = windowSize;

	        right++;
	    }

	    return max;
	}


	public static void main(String[] args) {
		var lswrc = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(lswrc.lengthOfLongestSubstring("abcabcbb"));
	}

}
