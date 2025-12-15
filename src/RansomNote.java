import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
	    Map<Character, Integer> count = new HashMap<>();

	    for (int i = 0; i < ransomNote.length(); i++) {
	        char c = ransomNote.charAt(i);
	        count.put(c, count.getOrDefault(c, 0) + 1);
	    }

	    for (int i = 0; i < magazine.length(); i++) {
	        char c = magazine.charAt(i);

	        if (!count.containsKey(c)) continue;

	        int remaining = count.get(c) - 1;
	        if (remaining == 0) {
	            count.remove(c);
	        } else {
	            count.put(c, remaining);
	        }

	        if (count.isEmpty()) return true;
	    }

	    return count.isEmpty();
	}


	public static void main(String[] args) {
		var rn = new RansomNote();
		System.out.println(rn.canConstruct("a", "b"));

	}

}
