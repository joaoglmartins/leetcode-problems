
public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {

	    if (strs == null || strs.length == 0) return "";
	    if (strs[0].length() == 0) return "";

	    int i = 0;

	    while (true) {
	        if (i >= strs[0].length()) {
	            return strs[0];
	        }

	        char letter = strs[0].charAt(i);

	        for (String word : strs) {
	            
	        	if (i >= word.length()) {
	                return strs[0].substring(0, i);
	            }
	            
	            char letterCompare = word.charAt(i);
	            if (letterCompare != letter) {
	                return strs[0].substring(0, i);
	            }
	        }

	        i++;
	    }
	}


	public static void main(String[] args) {
		var lcp = new LongestCommonPrefix();
		System.out.println(lcp.longestCommonPrefix(new String[] {"flower", "flow"}));
	}

}
