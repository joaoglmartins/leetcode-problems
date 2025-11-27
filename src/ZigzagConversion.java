
public class ZigzagConversion {
	
	public String convert(String s, int numRows) {
	    if (numRows == 1) return s;

	    int n = s.length();
	    StringBuilder[] rows = new StringBuilder[numRows];

	    for (int i = 0; i < numRows; i++) {
	        rows[i] = new StringBuilder();
	    }

	    int row = 0;
	    boolean goingDown = true;

	    for (int i = 0; i < n; i++) {

	        rows[row].append(s.charAt(i));

	        if (goingDown) {
	            row++;
	            if (row == numRows - 1) {
	                goingDown = false;
	            }
	        } else {
	            row--;
	            if (row == 0) {
	                goingDown = true;
	            }
	        }
	    }

	    StringBuilder result = new StringBuilder();
	    for (StringBuilder sb : rows) {
	        result.append(sb);
	    }

	    return result.toString();
	}

	public static void main(String[] args) {
		var zc = new ZigzagConversion();
		System.out.println(zc.convert("PAYPALISHIRING", 4));
	}

}
