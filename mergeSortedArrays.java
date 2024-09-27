/**
Problem: https://leetcode.com/problems/merge-sorted-array/
TC: O(m + n)
SC: O(1)
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
        
        while (p >= 0) {
            if (p1 < 0 || nums2[p2] >= nums1[p1]) {
                nums1[p--] = nums2[p2--];
            } else {
                nums1[p--] = nums1[p1--];
            }
            
            if (p2 < 0)
                break;
        }
    }
}