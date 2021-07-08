// 80. Remove Duplicates from Sorted Array II - https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int removeDuplicates(int[] nums) {
        int in = 2;
        for(int i=2; i<nums.length; i++)
        {
            if(nums[i] != nums[in-2])
            {
                nums[in] = nums[i];
                in++;
            }
        }
        return in;
    }
}