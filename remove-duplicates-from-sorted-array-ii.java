// Approach:
// Use two pointers: i to iterate through the array, j to place allowed elements.
// If the current element is not equal to the element at j-2 (i.e., no more than two occurrences),
// copy it to the j-th position. Continue until the end.
//
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n; // If length is 2 or less, no need to modify
        }

        int j = 2; // Position to insert the next valid element

        for (int i = 2; i < n; i++) {
            // Check if current element is allowed (no more than two occurrences)
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j; // New length of the array with at most two duplicates
    }
}
