// ## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]

// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Approach : This is a 2 pointer approach.
class Solution {
    public int removeDuplicates(int[] nums) {
        // Base Condition
        if(nums==null || nums.length==0){
            return 0;
        }
        int count =1;
        int n=nums.length;
        int j=1;
        //Traversing a array
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}