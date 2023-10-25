// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class RemoveDuplicateFromSortedArray
{
    class Solution {
        public int removeDuplicates(int[] nums)
        {
            int count = 1, k = 2, slow = 0, fast = 0, n = nums.length;

            while(fast < n)
            {
                if(fast != 0 && nums[fast] == nums[fast-1])
                    count++;
                else
                    count = 1;

                if(count <= k)
                {
                    nums[slow] = nums[fast];
                    slow++;
                }
                fast++;
            }
            return slow;
        }
    }
}
