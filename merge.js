// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Comparing value between m-1 and n-1 index and the value which is getting stored in nums1 array at a index.

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    if(nums1 === null) retrun;
    let p1 = m - 1;
    let p2 = n - 1;
    let idx = m+n - 1;
    while(p1 >= 0 && p2 >= 0){
        if(nums1[p1] > nums2[p2]) {
            nums1[idx] = nums1[p1];
            p1--;
        } else {
            nums1[idx] = nums2[p2];
            p2--;
        }
        idx--;
    } 
    while(p2 >= 0) {
        nums1[idx] = nums2[p2];
        p2--;
        idx--;
    }
};