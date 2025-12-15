import java.util.HashMap;

public class RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
        var letterCounter = new HashMap<Character, Integer>();
        for (int i = 0; i < ransomNote.length(); i++) {
        	
        	char c = ransomNote.charAt(i);
        	
        	if (!letterCounter.containsKey(c)) {
        		letterCounter.put(c, 1);
        	} else {
        		letterCounter.merge(c, 1, (a, b) -> a + b);
        	}        	
        }
        
    	for (int j = 0; j < magazine.length(); j++) {
    		
    		char c = magazine.charAt(j);
    		
    		int remaining = letterCounter.getOrDefault(c, -1);
    		
    		if (remaining == -1) continue;
    		
    		letterCounter.merge(c, -1, (a, b) -> a + b);
    	}
    	
    	var res = letterCounter.values();
    	for (Integer r : res) {
    		if (r > 0) return false;
    	}
        
        return true;
    }

	public static void main(String[] args) {
		var rn = new RansomNote();
		System.out.println(rn.canConstruct("a", "b"));

	}

}
