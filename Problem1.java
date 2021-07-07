// Time Complexity : 
//      removeDuplicates() - O(n)
//      
// Space Complexity :
//      removeDuplicates() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int s = 0, f = 1;
        boolean flag = false;
        
        while(f < nums.length)
        {
            if(nums[s] == nums[f])
            {
                if(flag == false)
                {
                    ++s;
                    nums[s] = nums[f];
                    ++f;
                    flag = true;
                }
                else
                {
                    while(f < nums.length && nums[f] == nums[f-1])
                        ++f;
                }
            }
            else
            {
                ++s;
                nums[s] = nums[f];
                ++f;
                flag = false;
            }
        }
        
        return s+1;
    }
}