// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;
        }

        int p1 = m - 1; // nums1
        int p2 = n - 1; // nums2
        int p3 = m + n - 1; // nums1

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
                p3--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }
        }

        while (p2 >= 0) { // if there are elements remaining in array 2, copy them to the beginning of the
                          // first array
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }
    }
}