
// Time Complexity : O(n) length of array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
     
        int ptr=1;   // take cares of index to put data
        int left=0;  // slow pointer
        int right=1; // fast pointer
        
        while(right<nums.length)
        {
            if(nums[right]==nums[left])
            {
                right++;  // move ahead if duplicate
            }else{
                left = right; // move left to new start point
                right++;  // increment right further
            }
            
            if(right-left<=2)
            {
                nums[ptr++]=nums[left]; // keep storing at ptr location unless there are less than 2 duplicates
            }
            
        }
        
        
        return ptr;
        
    }
}