// Time complexity - O(n)
//Space - O(1)
// Solved on leetcode - yes
// Faced an issues - no
//i is the index where the next valid element should be placed.
//If i < 2, we always insert since we need at least two of the same element.
//If n > nums[i - 2], it means the current n has not already appeared twice. So we insert it.
//Otherwise, we skip n (since it would be a 3rd or more occurrence).
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;  // Points to position to insert allowed number
        for (int n : nums) {
            // Allow the first two occurrences of each number
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
