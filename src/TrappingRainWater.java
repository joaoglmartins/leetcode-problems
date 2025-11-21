
public class TrappingRainWater {
	
	public int trap(int[] height) {

	    int n = height.length;
	    if (n <= 2) return 0;

	    int leftIdx = 0;
	    int rightIdx = n - 1;

	    int leftMax = 0;
	    int rightMax = 0;

	    int totalWater = 0;

	    while (leftIdx < rightIdx) {

	        if (height[leftIdx] < height[rightIdx]) {

	            if (height[leftIdx] >= leftMax) {
	                leftMax = height[leftIdx];
	            } else {
	                totalWater += (leftMax - height[leftIdx]);
	            }

	            leftIdx++;

	        } else {

	            if (height[rightIdx] >= rightMax) {
	                rightMax = height[rightIdx];
	            } else {
	                totalWater += (rightMax - height[rightIdx]);
	            }

	            rightIdx--;
	        }
	    }

	    return totalWater;
	}
	
	public static void main(String[] args) {
		var trw = new TrappingRainWater();
		System.out.println(trw.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));

	}

}
