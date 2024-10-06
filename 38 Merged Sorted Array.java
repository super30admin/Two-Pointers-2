// Time Complexity :  0(m+n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, idx = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while (p2 >= 0) {
            nums1[idx] = nums2[p2];
            idx--;
            p2--;
        }
    }
}
