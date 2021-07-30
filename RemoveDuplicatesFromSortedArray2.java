// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//We use 2 pointers to approach this problem, wherein the first pointer 
//always stays within bounds and the second pointer is used to copy the elements 

class Solution {
    public int removeDuplicates(int[] nums) {
     
        int j=1, count=1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]) 
                count++;
            else
                count=1;
            
            if(count<=2)
                nums[j++]=nums[i];
        }
        
        return j;
    }
}