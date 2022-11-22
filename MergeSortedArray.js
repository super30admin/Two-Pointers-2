// Time Complexity : O (m +n) where m and n are the length of two arrays
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Using three pointers p1,p2,p3 and looping backwards by replacing zeros with the higher value between nums1 and nums2. Repacing the nums1 in place .

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
  var p1 = m - 1;
  var p2 = n - 1;
  var p3 = m + n - 1;

  while (p1 >= 0 && p2 >= 0) {
    if (nums1[p1] > nums2[p2]) {
      nums1[p3] = nums1[p1];
      p1--;
    } else {
      nums1[p3] = nums2[p2];
      p2--;
    }
    p3--;
  }

  //When nums2 still has item left
  while (p2 >= 0) {
    nums1[p3] = nums2[p2];
    p3--;
    p2--;
  }
};
