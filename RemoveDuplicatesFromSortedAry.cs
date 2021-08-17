using System;
using System.Collections.Generic;
using System.Text;

namespace TwoPointers
{
    class RemoveDuplicatesLC
    { 
        //Time Complexity: O(n)
        //Space Complexity:O (1)
        public int RemoveDuplicates(int[] nums)
        {
            if (nums == null || nums.Length == 0)
            {
                return 0;
            }
            int cnt = 1, i = 1, j = 1;
            while (i < nums.Length)
            {
                if (nums[i] == nums[i - 1])
                {
                    cnt++;
                }
                else
                {
                    cnt = 1;
                }
                if (cnt <= 2)
                {
                    nums[j] = nums[i];
                    j++;
                }
                i++;
            }
            return j;
        }
    }
}
