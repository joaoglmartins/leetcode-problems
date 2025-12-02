
public class TwoSumII {
	
	public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        
        while (leftPointer < rightPointer) {
        	int sum = numbers[leftPointer] +  numbers[rightPointer];
        	
        	if (sum == target) return new int[] {++leftPointer, ++rightPointer};
        	
        	if (sum > target) {
        		rightPointer--;
        	} else {
        		leftPointer++;
        	}
        }
        
        return new int[] {++leftPointer, ++rightPointer};
    }

	public static void main(String[] args) {
		var tsii = new TwoSumII();
		int[] res = tsii.twoSum(new int[] {2,3,4}, 6);
		for (int i : res) System.out.println(i);
	}

}