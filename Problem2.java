package TwoPointers2;
/**
 * 
 * We keep a pointer each at the end of both arrays, and based on whatever value is larger we put that
 * value to the end of the first array and move that pointer to the left.
 * 
 * Time Complexity :
 * Max(O(m)) where m is the length of first array with extra space.
 * 
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem2 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int last = m + n - 1;

		if (m == 0) {
			nums1[0] = nums2[0];
		}

		while (p1 >= 0 && p2 >= 0) {
			if (nums2[p2] >= nums1[p1]) {
				nums1[last] = nums2[p2];
				p2--;
				last--;
			} else {
				nums1[last] = nums1[p1];
				p1--;
				last--;
			}
		}

		if (p2 >= 0) {
			while (p2 >= 0) {
				nums1[last] = nums2[p2];
				p2--;
				last--;
			}
		}
	}
}
