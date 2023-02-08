
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/**
 * Take two pointers p1 n p2 pointing to last element of both arrays.
 * Iterate from last element of nums1 which has 0s. Then check if p2 has
 * already reached 0th element if not proceed and check p1th element, if not
 * reached 0, is greater than p2th element in nums2. If so put it in ith position and 
 * decrement p1, else put p2th element in ith position and decrement p2.
 *
 */
class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1, p2 = n - 1;
		for (int i = m + n - 1; i >= 0; i--) {
			if (p2 < 0)
				break;

			if (p1 >= 0 && nums2[p2] <= nums1[p1]) {
				nums1[i] = nums1[p1];
				p1--;
			} else {
				nums1[i] = nums2[p2];
				p2--;
			}
		}
	}
}