/*
Runtime complexity - O(N) where N is the elements in the nums array.
Space complexity - O(1)  - no extra space is used for this approach.
Approach - Two pointers
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null && nums.length==0)
            return 0;
        int slow=0;
        int fast=0;
        int n=nums.length;
        int count=0;
        while(fast < n)
        {
            if(fast==0 || nums[fast]==nums[fast-1])
            {
                if(count<2)
                {
                    nums[slow]=nums[fast];
                    count++;
                    slow++;
                    fast++;
                }
                else
                {
                    count++;
                    fast++;
                }
            }
            else
            {
                nums[slow]=nums[fast];
                slow++;
                count=1;
                fast++;
            }
        }
        return slow;
    }
}
