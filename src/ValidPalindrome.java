
public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {

	    StringBuilder clean = new StringBuilder();
	    for (char c : s.toCharArray()) {
	        if (Character.isLetterOrDigit(c)) {
	            clean.append(Character.toLowerCase(c));
	        }
	    }

	    String str = clean.toString();
	    if (str.isEmpty()) return true;

	    int i = 0;
	    int j = str.length() - 1;

	    while (i <= j) {
	        if (str.charAt(i) != str.charAt(j)) return false;
	        i++;
	        j--;
	    }

	    return true;
	}

	public static void main(String[] args) {
		var vp = new ValidPalindrome();
		System.out.println(vp.isPalindrome("race a car"));

	}

}
