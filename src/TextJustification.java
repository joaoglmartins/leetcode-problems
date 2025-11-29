import java.util.ArrayList;
import java.util.List;

public class TextJustification {
	
	public List<String> fullJustify(String[] words, int maxWidth) {
	    List<String> res = new ArrayList<>();

	    for (String word : words)  {
	        if (res.isEmpty()) res.add("");

	        int resIndex = res.size() - 1;
	        String current = res.get(resIndex);

	        if (current.equals("")) {
	            res.set(resIndex, word);
	            continue;
	        }

	        if (current.length() + 1 + word.length() <= maxWidth) {
	            res.set(resIndex, current + " " + word);
	        } else {
	            res.add(word);
	        }
	    }

	    List<String> justified = new ArrayList<>();

	    for (int i = 0; i < res.size(); i++) {
	        String line = res.get(i);

	        if (i == res.size() - 1) {
	            // pad to the right
	            while (line.length() < maxWidth) {
	                line = line + " ";
	            }
	            justified.add(line);
	            break;
	        }

	        int length = line.length();

	        String[] parts = line.split(" ");
	        int wordCount = parts.length;

	        if (wordCount == 1) {
	            while (line.length() < maxWidth) {
	                line = line + " ";
	            }
	            justified.add(line);
	            continue;
	        }

	        int charsLen = 0;
	        for (String p : parts) charsLen += p.length();

	        int totalSpaces = maxWidth - charsLen;
	        int gaps = wordCount - 1;

	        int spaceEach = totalSpaces / gaps;
	        int extraSpaces = totalSpaces % gaps;

	        String newLine = "";
	        for (int j = 0; j < parts.length; j++) {
	            newLine += parts[j];

	            if (j == parts.length - 1) break;

	            for (int s = 0; s < spaceEach; s++) {
	                newLine += " ";
	            }

	            if (extraSpaces > 0) {
	                newLine += " ";
	                extraSpaces--;
	            }
	        }

	        justified.add(newLine);
	    }

	    return justified;
	}


	public static void main(String[] args) {
		var tj = new TextJustification();
		System.out.println(tj.fullJustify(new String[] {"What","must","be","acknowledgment","shall","be"}, 16));
	}

}
