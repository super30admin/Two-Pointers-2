// Approach:
// Start filling nums1 from the end using three pointers:
// i points to the last valid element in nums1,
// j points to the last element in nums2,
// k points to the end of nums1's total length.
// Compare and place the larger of nums1[i] or nums2[j] at nums1[k], and move pointers accordingly.

// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;           // Last valid element in nums1
        int j = n - 1;           // Last element in nums2
        int k = m + n - 1;       // End position in nums1

        // Merge in reverse order to avoid overwriting values in nums1
        while (j >= 0) {
            // If nums1[i] is greater, place it at the end
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                // Otherwise, place nums2[j] at the end
                nums1[k--] = nums2[j--];
            }
        }
    }
}
