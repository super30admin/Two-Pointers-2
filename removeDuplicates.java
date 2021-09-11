// Time Complexity : O(n) where n is the length of the nums array
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We maintain 2 pointers fast and slow we swap fast and slow pointers when our conditions are met i.e when we have uniue number whose count is less than 2 and we move both the pointers by 1 else if conditions are not met we just move fast pointer by 1 

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int k = 2;
        int currentK = 0;
        for(int fast=0; fast<nums.length; fast++){
            if(fast!= 0 && nums[fast] != nums[fast-1]){
                currentK = 1;
            }
            else {
                currentK++;
            }
           
            if(currentK<=k){
                nums[slow] = nums[fast];
                slow++;
            }
             
        }
        
        return slow;
    }
}