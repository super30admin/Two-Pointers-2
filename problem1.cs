public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int k=2;
        int count=0;
        int slow=0;
        int fast=0;
        while(fast<nums.Length)
        {
            if(fast!=0&&nums[fast]==nums[fast-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=k)
            {
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}