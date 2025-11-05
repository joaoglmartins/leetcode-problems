import java.util.Arrays;

public class MergeSortedArray {
	//Solution for https://leetcode.com/problems/merge-sorted-array/
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int[] nums1Copy = Arrays.copyOfRange(nums1, 0, m);
		
        int nums1Idx = 0;
        int nums2Idx = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] == 0) {
				if (nums1Idx < m && nums1Copy[nums1Idx] < nums2[nums2Idx]) {
					nums1[i] = nums1Copy[nums1Idx];
					nums1Idx++;
				} else {
					nums1[i] = nums2[nums2Idx];
					nums2Idx++;					
				}
				continue;
			}
			
			if (nums1Copy[nums1Idx] < nums1[i]) {
				nums1[i] = nums1Copy[nums1Idx];
				nums1Idx++;
				continue;
			}
			
			if (nums2Idx < n && nums2[nums2Idx] < nums1[i]) {
				nums1[i] = nums2[nums2Idx];
				nums2Idx++;
				continue;
			}
			
			nums1Idx++;
			
		}	
    }
	
	public static void main(String[] args) {
		var msa = new MergeSortedArray();
		msa.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
	}
}
