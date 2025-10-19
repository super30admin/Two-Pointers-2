
// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

/*
 * Approach
 * 
 * In this approach we a use count var to keep one the desired number of occurances
 * can we use two pointer one slow and one fast to swap values
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}