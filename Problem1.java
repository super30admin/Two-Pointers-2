/*
80. Remove Duplicates from Sorted Array II
TC: O(n) SC: O(1)
First 2 elements are already valid, put slow and fast on index 2, fast tracks index of new elements to put on index slow, at every point check if the new element on fast is valid by checking if the element has occured has less than 2 times by checking slow - k, this works since array is sorted, since if the element has occured less than 2 times slow - k will not be equal to element on index fast.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2; // Max 2 duplicates are allowed
        int slow = k, fast = k; // First 2 elements in nums are always valid

        for(int i = k; i < nums.length; i++){
            if(nums[slow - k] != nums[fast]){ // Check if the element has not occured more than k times
                nums[slow] = nums[fast]; // Store it 
                slow++;
            }
            fast++; // Move to next element
        }

        return slow;
    }
}