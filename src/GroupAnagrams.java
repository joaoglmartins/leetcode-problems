import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		
		if (strs.length == 0) return new ArrayList<>(Arrays.asList(Arrays.asList("")));
		
		Map<String, List<String>> strsMap = new HashMap<>();
		
		for (String str : strs) {
			List<String> keys = new ArrayList<String>(strsMap.keySet());
			
			boolean added = false;
			for (String key : keys) {
				if (isAnagram(key, str)) {
					List<String> value = strsMap.get(key);
					value.add(str);
					strsMap.put(key, value);
					added = true;
					break;
				}
			}
			
			if (added) continue;
			
			strsMap.put(str, Arrays.asList(str));
		}
		
		List<List<String>> res = (List<List<String>>) strsMap.values();
		
		return res;
		
	}
	
	private boolean isAnagram(String s, String t) {
		
		if (s.length() != t.length()) return false;
		
		int[] alpha = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			
			alpha[sChar - 'a'] += 1;
			alpha[tChar - 'a'] -= 1;
		}
		
		for (int n : alpha) {
			if (n != 0) return false;
		}
		
		return true;
    }

	public static void main(String[] args) {
		var ga = new GroupAnagrams();
		var res = ga.groupAnagrams(new String[] {});

	}

}
