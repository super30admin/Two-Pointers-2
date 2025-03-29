// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// Place two pointers slow, fast at the index 1 as the first element of array is unique.
// If element at fast pointer is same as previous, increase count by 1, move the pointers by placing element at fast to that of slow.
// If the count is greater than two, move the fast pointer to next unique element and place it with slow pointer till condition is met for all unique numbers.



class Solution {
    public int removeDuplicates(int[] nums) {
        int s=1;
        int count=1;
        for(int f=1;f<nums.length;f++){
            if(nums[f]==nums[f-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[s]=nums[f];
                s++;
            }
        }
        return s;
    }
}