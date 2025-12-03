
public class ContainerMostWater {
	
	public int maxArea(int[] height) {
        int max = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        while (leftPointer < rightPointer) {
        	int minHeight = Math.min(height[leftPointer], height[rightPointer]);
        	int width = rightPointer - leftPointer;
        	
        	if(minHeight * width > max) max = minHeight * width;
        	
        	if(height[leftPointer] < height[rightPointer]) {
        		leftPointer++;
        	} else {
        		rightPointer--;
        	}
        }
        
        return max;
    }

	public static void main(String[] args) {
		var cmw = new ContainerMostWater();
		System.out.println(cmw.maxArea(new int[] {8,7,2,1}));
	}

}
