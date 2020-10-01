
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0)
        {
            return 0;
        }

        int left = 2;

        for(int right = 2 ; right<nums.length ; right++)
        {
            if(nums[left-2] != nums[right])
            {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
