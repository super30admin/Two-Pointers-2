// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public int removeDuplicates(int[] nums) {
        
        // TC: O(n)
        // SC: O(1)
        if(nums == null || nums.length == 0) return 0;
        int count = 1;
        int slow = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            }
            else {
                count = 1;
            }
            if(count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        
        return slow;
    }
}