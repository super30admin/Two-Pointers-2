// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;
        }
        int p1 = m - 1; // pointer at the end of first array's last element
        int p2 = n - 1; // pointer at the end of second array
        int p3 = m + n - 1; // pointer at the end of last array
        while (p1 >= 0 && p2 >= 0) { // end pointer are greater than 0
            nums1[p3] = Math.max(nums1[p1], nums2[p2]); // getting maximum of two pointers
            p3--; // decrement 
            if (nums1[p1] > nums2[p2]) {
                p1--;
            } else {
                p2--;
            }
        }
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }
    }
}