
public class ContainerMostWater {
	
	public int maxArea(int[] height) {
        int max = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        while (leftPointer < rightPointer) {
        	int width = Math.min(height[leftPointer], height[rightPointer]);
        	int length = rightPointer - leftPointer;
        	
        	if(width * length > max) max = width * length;
        	
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
