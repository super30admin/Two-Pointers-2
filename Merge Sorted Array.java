class Solution {
    /**
     * # Time complexity: O(m + n), where m and n are the lengths of nums1 and nums2 respectively.
     * # Space complexity: O(1), as the merging is done in-place.
     * # Leetcode: Yes
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            p3--;
            if (nums1[p1] > nums2[p2]) {
                p1--;
            } else {
                p2--;
            }
        }
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}
