// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/**
 * Using fast pointer to move one index at a time. Using slow pointer to fill the data based on the occurrence count.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int n = nums.length;
        int slow = 1;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                count++;
            else
                count = 1;

            if (count <= k) {
                nums[slow++] = nums[i];
            }
        }

        return slow;
    }
}