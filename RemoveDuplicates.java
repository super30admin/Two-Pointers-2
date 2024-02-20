
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
//Approach - Two pointers where one determines the position to be swapped and the other searches for the unique element.

class Solution {
    public int removeDuplicates(int[] nums) {

        int slow = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // At 0th index or previous number is not equal to current, reset the count
            if (i == 0 || nums[i] != nums[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            // If count exceeds allowed duplication value then swap
            if (count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}