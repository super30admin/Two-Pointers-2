using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class RemoveDuplicates
    {
        /*
         *  T.C: O(n) since traversing through whole array 
         *  S.C: O(1) not using extra space
         */

        public int RemoveDuplicatesFromArray(int[] nums)
        {

            if (nums == null || nums.Length == 0)
                return 0;

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
                    nums[slow] = nums[fast];
                    slow++;
                }
            }

            return slow;
        }
    }
}
