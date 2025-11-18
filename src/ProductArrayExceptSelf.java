import java.util.Arrays;

public class ProductArrayExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
        int[] answear = new int[nums.length];
        
        answear[0] = 1;
        for (int i = 1; i < nums.length; i++)  {
        	answear[i] = nums[i-1] * answear[i-1];
        }
        
        int temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
        	answear[i] *= temp;
        	temp *= nums[i]; 
        }

        return answear;
    }

	public static void main(String[] args) {
		var paes = new ProductArrayExceptSelf();
		System.out.println(Arrays.toString(paes.productExceptSelf(new int[] {-1,1,0,-3,3})));

	}

}
