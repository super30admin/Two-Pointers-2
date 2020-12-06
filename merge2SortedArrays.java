// Time Complexity :O(M+N)
// Space Complexity : O(!)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO
// Your code here along with comments explaining your approach
// 1. use 3 pointers one each at the end of two arrays and one at the end of resultant array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int k = m + n - 1;
        int i = m - 1, j = n - 1;
        
        while(i >= 0 && j >= 0) {
            if(nums2[j] > nums1[i]) {
                nums1[k] = nums2[j];
                j--;
            }
            else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
    }
}