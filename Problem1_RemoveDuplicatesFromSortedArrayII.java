
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int slow=1;
        
        int count=1;
        
        for(int fast=1;fast<nums.length;fast++)
        {
            if(nums[fast]==nums[fast-1])
                count++;
            else
                count=1;
            
            if(count<=2)
            {
                if(slow!=fast)
                    nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}