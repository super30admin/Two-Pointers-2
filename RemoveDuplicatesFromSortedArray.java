//Problem 39 : Remove Duplicates from Sorted Array II-> Remove more than 2 duplicates 
// Time Complexity : O(n), n stands for length of the array
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

/**
 Brute force: Use Hashing->Map, and store the frequency of each element. Then while iterating input array just place the allowed frequency only in the input array. TC-O(n) | SC: O(n)->for Hash Map  
 Optimized : Use Concept of slow and fast pointers, however here fast pointer will increment by 1 only. Initialise fast, slow and count with 1. If element at fast pointer is similar to the element at fast-1, then just increase the count otherwise reset the count to 1.
 If count<=k, here k is allowed duplicates, then assign/swap the values of fast to slow and move slow pointer.
 
 Note: This is a generalized algo that can be used with k allowed duplicates.
 */

class Solution39 {
    public int removeDuplicates(int[] nums) {
        //Remove k duplicates;
        
        if(nums==null || nums.length==0) return 0;
        
        //TC: O(n) | SC:O(1)
        int count =1;
        int slow = 1;
        int fast = 1;
        
        int k=2;//allowed duplicates
        
        while(fast<nums.length){
            
            if(nums[fast]==nums[fast-1]) count++;
            else count = 1; //reset the count if cuurent element not similar to the previous element
            
            if(count<=k) {//count less than or equal to allowed duplicates
                nums[slow] = nums[fast];
                slow++;
            }
            
            fast++;
        }
        
        return slow;
    }
}