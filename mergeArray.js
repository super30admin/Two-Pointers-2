// Time Complexity : O(m+n )
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    if(nums1 == null || nums1.length == 0) return 

    let p1 = m-1, p2 = n -1, i = m+n -1; 
    while(p1 >= 0 && p2 >= 0){
        if(nums1[p1] > nums2[p2]){
            nums1[i] = nums1[p1]
           
            p1--
        }
        else {
            nums1[i] = nums2[p2]
            p2--
        }
        i--
    }
    while(p2 >= 0){
        nums1[i] = nums2[p2]
        i--;p2--;
    }
    
};