/**
Time Complexity : O(N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
**/
class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        
        int i =0;
        int j =0;
        int index = 0;
        int maxCount = 2;
        
        while(j < nums.length)
        {
            int count = 0;
            
            while(j < nums.length && nums[i] == nums[j] )
            {
                count++;
                j++;
            }
            
            int copyCount = Math.min(count, maxCount);
            
            for(int m = i; m < i + copyCount; m++)
            {
                nums[index++] = nums[m];
            }
            
            i = j;
        }
        
        
        return index;
        
    }
}