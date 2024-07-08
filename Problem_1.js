https://leetcode.com/problems/merge-sorted-array/
// Time Complexity : O(m+n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Solution: 

// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let p1 = m-1;
    let p2 = n-1;
    let index = m+n-1;
    //Compare both the array from the last index, pick the largest of the two elements and place it in the nums1 index from the end. 
    while (p1>= 0 && p2 >=0){
        if(nums1[p1] >= nums2[p2]){
            nums1[index] = nums1[p1];
            p1--;
        }
        else{
            nums1[index] = nums2[p2];
            p2--;
        }
        index--;
    }
    //Run loop for any remaining values in nums2 array ; could happen when any or all nums2 elements are the smallest as compared to nums1
    while(p2>=0){
        nums1[index] = nums2[p2];
        p2--;
        index--;
    }
};