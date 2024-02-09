//## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

// Time Complexity : O(M+N), where M+N is the sum of elements in nums1 and nums2
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

    // Use three pointers pointers slow and fast
    // idx - points to end of resultant array and denotes last insert position
    // i,j - points to back of input arrays nums1 and nums2 respectively
    // The idea is to fill nums1 from back with greater element from nums1 and nums2, also from back

// Your code here along with comments explaining your approach

class Solution {
    private void helper(int[] nums1, int m, int[] nums2, int n){
        // Start from back
        int idx=m+n-1;
        int i=m-1, j=n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                // Place bigger element at end
                nums1[idx]=nums1[i];
                i--;
            }else{
                nums1[idx]=nums2[j];
                j--;
            }
            idx--;
        }

        // Iterate over remaining elements in nums2, if any
        while(j>=0){
            nums1[idx]=nums2[j];
            idx--;
            j--;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        helper(nums1, m, nums2, n);
    }
}