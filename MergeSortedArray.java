// Time Complexity : O(M+N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * 1. Mantain 3 pointers. one on array1 m-1, another on array2 n-1, other pointer at the end of array1.
 * 2. compare pointer1 and pointer2 which ever grater copy to current position and move pointer.
 * 3. if array 2 pointer is not 0 then copy till it is zero.
 */

import java.util.Arrays;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int num1p = m - 1;
		int num2p = n - 1;
		int currp = nums1.length - 1;
		while (currp >= 0 && num2p >= 0 && num1p>=0) {
			if (nums1[num1p] > nums2[num2p]) {
				nums1[currp] = nums1[num1p];
				num1p--;
			} else {
				nums1[currp] = nums2[num2p];
				num2p--;
			}
			currp--;
		}
		
		while(num2p>=0) {
			nums1[currp] = nums2[num2p];
			num2p--;
			currp--;
		}
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] { 2,0};
		int[] nums2 = new int[] { 1};
		new MergeSortedArray().merge(nums1, 1, nums2, 1);
		System.out.println(Arrays.toString(nums1));
	}
}
