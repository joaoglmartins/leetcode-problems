import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> sMap = new HashMap<>();
	    Map<Character, Character> tMap = new HashMap<>();

	    for (int i = 0; i < s.length(); i++) {
	        char c1 = s.charAt(i);
	        char c2 = t.charAt(i);

	        if (sMap.containsKey(c1)) {
	            if (sMap.get(c1) != c2) return false;
	        } else {
	            sMap.put(c1, c2);
	        }

	        if (tMap.containsKey(c2)) {
	            if (tMap.get(c2) != c1) return false;
	        } else {
	            tMap.put(c2, c1);
	        }
	    }

	    return true;
    }

	public static void main(String[] args) {
		var is = new IsomorphicStrings();
		System.out.println(is.isIsomorphic("bbbaaaba", "aaabbbba"));
	}

}
