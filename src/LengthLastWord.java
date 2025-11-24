
public class LengthLastWord {
	
	public int lengthOfLastWord(String s) {
		int length = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				if (length == 0) continue;
				return length;
			} else {
				length++;
			}
		}
		
		return length;
    }

	public static void main(String[] args) {
		var llw = new LengthLastWord();
		System.out.println(llw.lengthOfLastWord("   fly me   to   the moon  "));

	}

}
