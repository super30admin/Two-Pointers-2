	public class Solution
	{
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public int RemoveDuplicates(int[] nums)
        {
            if (nums == null || nums.Length == 0) return 0;
            int n = nums.Length;
            int slow = 0;
            int count = 0;
            int k = 2;

            for (int i = 0; i < n; i++)
            {
                if (i == 0 || nums[i] == nums[i - 1])
                    count++;
                else
                    count = 1;

                if (count <= k)
                {
                    nums[slow] = nums[i];
                    slow++;
                }
            }
            return slow;
        }
    }
