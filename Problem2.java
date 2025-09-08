// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/**
 * Using a pointer to start filling the max number at the end of nums1 array between nums1 and nums2's last indexes since both arrays are sorted.
 * If we have any numbers left over from nums2 in initial pass, we just have to directly update those numbers in p1.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int last = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[last] = nums1[p1];
                p1--;
            } else {
                nums1[last] = nums2[p2];
                p2--;
            }
            last--;
        }

        while (p2 >= 0) {
            nums1[last] = nums2[p2];
            p2--;
            last--;
        }
    }
}