// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int slow = 0; int fast = 0;

        int count = 0;

        while (fast < nums.length) {
            if (fast != 0 && nums[fast] == nums[fast-1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= k) {
                nums[slow] = nums[fast];
                slow++;
            }

            fast++;
        }

        return slow;
    }
}