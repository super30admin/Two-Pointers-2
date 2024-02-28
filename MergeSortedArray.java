## Problem2 (https://leetcode.com/problems/merge-sorted-array/)


// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // take three pointers, end of nums1, end of nums2 and end of the combined array.
        int i= m-1;
        int j= n-1;
        int k = n+m-1;

        while(i>=0 && j>=0){
            // check which is greater and assign that number to k. 
            if(nums1[i]>=nums2[j]){
                nums1[k] = nums1[i];
                i--; 
            } else {
                nums1[k] = nums2[j];
                j--; 
            }
            k--;
        }

        // if the second array has elements left. add them to nums1 array.
        while(j>=0){
            nums1[k] = nums2[j];
            j--; 
            k--;
        }
    }
}