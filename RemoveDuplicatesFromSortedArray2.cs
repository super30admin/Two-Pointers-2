using System;
namespace Algorithms
{
    public class RemoveDuplicatesFromSortedArray2
    {
        /// Time Complexity : O(N)
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Based on the discussion in class
        public int RemoveDuplicates(int[] nums)
        {
            if (nums == null || nums.Length == 0) return 0;

            int slow = 1;

            int counter = 1;
            for (int fast = 1; fast < nums.Length; fast++)
            {
                if (nums[fast] == nums[fast - 1])
                {
                    counter++;
                }
                else
                {
                    counter = 1;
                }
                if (counter <= 2)
                {
                    nums[slow++] = nums[fast];
                }

            }
            return slow;

        }
    }
}
