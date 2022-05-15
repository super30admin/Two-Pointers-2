// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=1;
        int fast=1;
        int count=1;
        while(fast<nums.length)
        {
            if(nums[fast-1]!=nums[fast])
                count=1;
            else count++;
            if(count<=2)   //when the element occurence is atmost two times swap it with the fast pointer
            {
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}