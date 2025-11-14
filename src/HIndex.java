
public class HIndex {
	
	public int hIndex(int[] citations) {
		
		if (citations.length == 1) return citations[0];
		
		int hindex = 0;
		
        for (int i = 0; i < citations.length; i++) {
        	int counter = 0;
        	for (int citation : citations) {
        		if (citation >= i) counter++;
        	}
        	
        	if (counter >= i) hindex = i;
        }
        
        return hindex;
    }

	public static void main(String[] args) {
		var hi = new HIndex();
		System.out.println(hi.hIndex(new int[] {2,1}));
	}

}
