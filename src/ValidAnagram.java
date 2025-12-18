
public class ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
		
		if (s.length() != t.length()) return false;
		
		int[] alpha = new int[128];
		
		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			
			alpha[sChar] += 1;
			alpha[tChar] -= 1;
		}
		
		for (int n : alpha) {
			if (n != 0) return false;
		}
		
		return true;
    }

	public static void main(String[] args) {
		var va = new ValidAnagram();
		System.out.println(va.isAnagram("anagram", "nagaram"));

	}

}
