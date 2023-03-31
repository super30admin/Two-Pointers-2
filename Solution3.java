// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * I set slow at 1 and count as 1 initially. I run a for loop from fast = 1 to nums.length-1. If nums[fast]==nums[fast-1], I increment count.
 * Else I set count as 1. If count is less than or equal to 2, I set nums[slow] = nums[fast] and increment slow.
 */

 class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int count=1;
        for(int fast=1;fast<nums.length;fast++)
        {
            if(nums[fast]==nums[fast-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=2)
            {
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}