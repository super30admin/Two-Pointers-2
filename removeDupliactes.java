// Time Complexity : O(n),n is length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * use 2 pointer approach and a counter variable to check the number of occurrance.
 */
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        int count = 1;
        int slow = 1;

        for (int i = 1; i < nums.length; i++) {
            // if repeating value increament count
            if (nums[i] == nums[i - 1])
                count++;
            else {
                // or else just assign it as 1
                count = 1;
            }
            // if the count is almost 2, we assign the num value to slow pointer and
            // increament slow
            if (count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}