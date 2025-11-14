
public class HIndex {
	
	public int hIndex(int[] citations) {
		int hindex = 1;
		
        for (int i = 1; i <= citations.length; i++) {
        	int counter = 0;
        	for (int citation : citations) {
        		if (citation >= i) counter++;
        	}
        	
        	if (counter == i) hindex = i;
        }
        
        return hindex;
    }

	public static void main(String[] args) {
		var hi = new HIndex();
		System.out.println(hi.hIndex(new int[] {1,3,1}));
	}

}
