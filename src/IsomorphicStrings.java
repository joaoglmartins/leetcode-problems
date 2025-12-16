import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
        	sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        	tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        Integer[] sArray = sMap.values().toArray(new Integer[0]);
        Integer[] tArray = tMap.values().toArray(new Integer[0]);
        
        if (sArray.length != tArray.length) return false;
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        for (int j = 0; j < sArray.length; j++) {
        	if (sArray[j] != tArray[j]) return false; 
        }
        
        return true;
        
    }

	public static void main(String[] args) {
		var is = new IsomorphicStrings();
		System.out.println(is.isIsomorphic("bbbaaaba", "aaabbbba"));
	}

}
