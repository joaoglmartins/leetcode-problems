public class ReverseWordsInString {
	
	public String reverseWords(String s) {

	    int n = s.length();
	    StringBuilder result = new StringBuilder();

	    int i = n - 1;

	    while (i >= 0) {
	        while (i >= 0 && s.charAt(i) == ' ') {
	            i--;
	        }

	        if (i < 0) break;

	        int end = i;

	        while (i >= 0 && s.charAt(i) != ' ') {
	            i--;
	        }

	        int start = i + 1;

	        if (result.length() > 0) {
	            result.append(' ');
	        }
	        result.append(s.substring(start, end + 1));
	    }

	    return result.toString().stripTrailing();
	}


	public static void main(String[] args) {
		var rwis = new ReverseWordsInString();
		System.out.println(rwis.reverseWords("a good   example"));
	}

}
