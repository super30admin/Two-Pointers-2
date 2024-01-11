
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
         // Initialize index to 1 since the first element is always allowed
        int index = 1;
        // Initialize occurrence counter to 1 for the first element
        int occurrence = 1;

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is equal to the previous one
            if (nums[i] == nums[i - 1]) {
                // Increment the occurrence counter
                occurrence++;
            } else {
                // Reset occurrence counter since a new element is encountered
                occurrence = 1;
            }

            // Check if the occurrence count is less than or equal to 2
            if (occurrence <= 2) {
                // Update the array at the current index with the current element
                nums[index] = nums[i];
                // Increment the index
                index++;
            }
        }

        return index;
    }
}