// Merge sorted array (LC 88)
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Start at the end of each array and push greater value to end of array 1 and then
// keep decrementing array2 till you merge all values into array1

// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let i = m-1;
    let j = n-1;
    let k = m+n-1;
    while(i >= 0 && j >= 0){
        if(nums1[i] > nums2[j]){
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }
    while(j>=0){
        nums1[k] = nums2[j];
        j--;
        k--;
    }
};