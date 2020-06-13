
// Time Complexity : O(N+M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
import java.util.Arrays;

public class Merge_Sorted_Array {
	/*
	 * We assign two pointers pointing at the m-1 position of nums1 and n-1 position
	 * of nums2. We compare the values at two pointers and whatever value is greater
	 * we push it at the end and accordingly form our resultant nums1 array
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums2 == null) {
			return;
		}
		int i = m - 1;
		int j = n - 1;
		int k = (m + n) - 1;
		while (i >= 0 && j >= 0) {
			if (nums2[j] > nums1[i]) {
				nums1[k] = nums2[j];
				j--;
			} else {
				nums1[k] = nums1[i];
				i--;
			}
			k--;
		}
		while (j >= 0) {
			nums1[k] = nums2[j];
			k--;
			j--;
		}
	}

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));

	}
}