import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcatenationAllWords {
	
	public List<Integer> findSubstring(String s, String[] words) {
	    List<Integer> result = new ArrayList<>();

	    if (s.length() == 0 || words.length == 0) return result;

	    int wordLen = words[0].length();
	    int totalWords = words.length;

	    Map<String, Integer> target = new HashMap<>();
	    for (String w : words) {
	        target.put(w, target.getOrDefault(w, 0) + 1);
	    }

	    for (int offset = 0; offset < wordLen; offset++) {

	        int left = offset;
	        int right = offset;

	        Map<String, Integer> window = new HashMap<>();
	        int matched = 0;

	        while (right + wordLen <= s.length()) {

	            String word = s.substring(right, right + wordLen);
	            right += wordLen;

	            if (!target.containsKey(word)) {
	                window.clear();
	                matched = 0;
	                left = right;
	                continue;
	            }

	            window.put(word, window.getOrDefault(word, 0) + 1);
	            matched++;

	            while (window.get(word) > target.get(word)) {
	                String leftWord = s.substring(left, left + wordLen);
	                window.put(leftWord, window.get(leftWord) - 1);
	                matched--;
	                left += wordLen;
	            }

	            if (matched == totalWords) {
	                result.add(left);
	            }
	        }
	    }

	    return result;
	}


	public static void main(String[] args) {
		var scal = new SubstringConcatenationAllWords();
		var li = scal.findSubstring("barfoothefoobarman", new String[] {"foo","bar"});
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (Integer i : li) {
			s.append(i + ",");
		}
		s.delete(s.length() - 1, s.length());
		s.append("]");
		System.out.println(s);

	}

}
