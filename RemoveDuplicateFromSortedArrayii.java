
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        int count = 0, k = 2;
        while(fast < nums.length)
        {
            if(0 != fast && nums[fast] == nums[fast - 1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
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