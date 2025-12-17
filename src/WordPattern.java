import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	
	public boolean wordPattern(String pattern, String s) {
		Map<Character, String> patternMap = new HashMap<>();
	    Map<String, Character> sMap = new HashMap<>();
	    
	    String[] sArray = s.split(" ");
	    
	    if(pattern.length() != sArray.length) return false;

	    for (int i = 0; i < pattern.length(); i++) {
	    	char c = pattern.charAt(i);
	    	String w = sArray[i];

	        if (patternMap.containsKey(c)) {
	            if (!patternMap.get(c).equals(w)) return false;
	        } else {
	            patternMap.put(c, w);
	        }

	        if (sMap.containsKey(w)) {
	            if (sMap.get(w) != c) return false;
	        } else {
	            sMap.put(w, c);
	        }
	    }

	    return true;
    }

	public static void main(String[] args) {
		var wp = new WordPattern();
		System.out.println(wp.wordPattern("abba", "dog cat cat dog"));

	}

}
