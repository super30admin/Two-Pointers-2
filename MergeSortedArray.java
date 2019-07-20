package day13_TwoPointer2;

// Time Complexity: O(m + n) where m and n are lengths of both arrays
// Space Complexity: O(1) because no extra space is used
// Idea: Make first array-length as combined lengths of both the arrays.
//		 Start from comparing the last elements and fill the result array from rear end.
//		 Continue till both the arrays are iterated fully.

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		while (n > 0) {
			if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
				nums1[m + n - 1] = nums1[m - 1];
				m--;
			} else {
				nums1[m + n - 1] = nums2[n - 1];
				n--;
			}
		}
	}
}
