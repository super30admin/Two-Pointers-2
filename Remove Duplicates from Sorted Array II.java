/*
Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,1,2,3,3],

Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
*/

//Beats 75% Submissions. on LeetCode T: O(n) S: O(1)
// Using Two pointers keep tracks of the elements.

// This works even for an unsorted Array. We can increase the speed by actually using the fact that the array is sorted

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0)    return 0;
        
        int count = 0;
        int pointer = 0;
        int temp = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            
            if(temp == nums[i] && count == 0){
                count++;
                nums[++pointer] = nums[i];
            }
            
            if(temp != nums[i]){
                temp = nums[i];
                nums[++pointer] = nums[i];
                count = 0;
            }
        }
        return pointer + 1;
    }
}


// Using the fact that the array is sorted, for every element we check if it is greater than the previous two element to include it in the array

// This is beats 100% of Submissions on LeetCode

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int pointer = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(pointer < 2 || nums[i] > nums[pointer - 2]){
                nums[pointer++] = nums[i];
            }
        }
        return pointer;
    }
}