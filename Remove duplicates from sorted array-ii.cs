/*
  Time complexity: O(n)
  Space complexity: O(1)

  Code ran successfully on Leetcode: Yes

  Approach: The number of repeated elements is monitored through the count maintained in k. When k exceeds 2, we do not store the element duplicates and wait for a distinct element.

*/

public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int k = 2;
        int left = 0;
        int right = 1;
        int count = 1;

        while(right<nums.Length)
        {
            if(nums[right]==nums[right-1])
            {
                count++;
                if(count<=k)
                    nums[++left]=nums[right];
            }
            else
            {
                count=1;
                nums[++left] = nums[right];
            }
            right++;
        }
        return left+1;
    }
}
