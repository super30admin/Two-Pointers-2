// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // base case
        if (nums1 == null || nums1.length == 0) return;

        int p1 = m-1, p2 = n-1, p3 = (m + n) - 1;


        while (p1>=0 && p2>=0) {
            //comparison if elements at p1 and p2
            if (nums1[p1] >= nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }

        while (p2 >=0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}