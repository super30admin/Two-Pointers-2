
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int num: nums)
        {
            if(index < 2 || nums[index-2] != num)
            {
                nums[index] = num;
                index++;
            }
        }
        return index;
    }
}