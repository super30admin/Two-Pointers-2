/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
https://leetcode.com/problems/merge-sorted-array/
**Intuition:**
The goal is to merge two sorted arrays into `nums1` without using extra space, so we take advantage of the empty slots at the end of `nums1`.
By starting from the last valid elements of both arrays and comparing them, we always place the larger value at the end of `nums1`, which prevents overwriting elements that haven’t been processed yet. 

We continue this process until one array is exhausted; if `nums2` still has elements left, we copy them over, while any remaining elements in `nums1` are already in the correct position.

T.C: O(n), S.C: O(1)
 */
var merge = function(nums1, m, nums2, n) {
    let pointer1 = m-1, pointer2 = n-1, movePointer = m+n-1;
    while(pointer1 >= 0 && pointer2 >= 0){
        if(nums1[pointer1] > nums2[pointer2]){
            nums1[movePointer] = nums1[pointer1];
            pointer1--;
            movePointer--;
        }else{
           nums1[movePointer] = nums2[pointer2];
           pointer2--;
           movePointer--; 
        }
    }
    if(pointer1 < 0){
      while(pointer2 >= 0){
        nums1[movePointer] = nums2[pointer2];
        pointer2--;
        movePointer--;
      }
    }
};