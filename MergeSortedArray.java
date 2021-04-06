// Time Complexity :O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        // Compare nums1 and nums2 end element and insert it at the end of nums1
        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        // copy remaing nums2 value if any
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}