// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem2;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums1 == null || (m + n) == 0 || nums2 == null || n == 0) {
			return;
		}

		int ptr1 = m - 1;
		int ptr2 = n - 1;
		int ptr = m + n - 1;

		while (ptr >= 0) {
			if (ptr2 < 0) {
				break;
			}

			if (ptr1 >= 0 && nums1[ptr1] > nums2[ptr2]) {
				nums1[ptr--] = nums1[ptr1--];
			} else {
				nums1[ptr--] = nums2[ptr2--];
			}
		}
	}

	public static void main(String[] args) {
		MergeSortedArray obj = new MergeSortedArray();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		obj.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
		System.out.println("After merging:");
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}

}
