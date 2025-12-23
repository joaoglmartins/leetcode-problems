import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	
	public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            
            int end = nums[i];
            
            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }
        }
        
        return result;
    }

	public static void main(String[] args) {
		var sr = new SummaryRanges();
		System.out.println(sr.summaryRanges(new int[] {0,1,2,4,5,7}));
	}

}
