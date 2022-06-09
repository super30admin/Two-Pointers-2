// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
 var merge = function(nums1, m, nums2, n) {
    while (n) {
      if (nums1[m - 1] > nums2[n - 1]) {
        nums1[m + n - 1] = nums1[--m];  
      } else {
        nums1[m + n - 1] = nums2[--n];   
      }
    }
    return nums1;
  };