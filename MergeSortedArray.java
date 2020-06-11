
// Time Complexity : O max(m,n) --> where m & n are number of elements in the array nums1 & nums2 resp 
// Space Complexity : O(1) --> in-place
// Did this code successfully run on Leetcode (88): Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) return;
        if (nums2 == null || nums2.length == 0) return;
        
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (i >=0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        while (i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}