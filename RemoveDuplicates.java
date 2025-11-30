// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// 1: We maintain a slow pointer while iterating through the array to determine at which point we need to swap elements
// 2: We determine how many occurences we see the same element and then swap accordingly
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else
                count = 1;

            if (count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}