// Time Complexity : O(m); m = nums.length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int k = 2;
        int count = k - 1;
        int slow = k - 1;

        for(int i = k - 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count += 1;
            } else {
                count = 1;
            }

            if(count <= k) {
                nums[slow] = nums[i];
                slow += 1;
            }
        }

        return slow;
    }
}