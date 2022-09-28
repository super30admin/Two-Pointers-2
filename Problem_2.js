// Problem2 (https://leetcode.com/problems/merge-sorted-array/)

// Time Complexity : O(m+n), m is length of nums1 and n is length of nums2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Take 3 pointers
// i -> maintains larger number of nums1
// j -> maintains larger number of nums2
// index -> maintains index where the larger number should be added in nums1

// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
    if (nums1 === null || nums2 === null) {
        return;
    }
    // Take 3 pointers
    // i -> maintains larger number of nums1
    // j -> maintains larger number of nums2
    // index -> maintains index where the larger number should be added in nums1
    let i = m - 1;
    let j = n - 1;
    let index = nums1.length - 1;
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[index] = nums1[i];
            i--;
        } else {
            nums1[index] = nums2[j];
            j--;
        }
        index--;
    }
    // Ig the nums2 has elements, add them to nums1
    while (j >= 0) {
        nums1[index] = nums2[j];
        j--;
        index--;
    }
};