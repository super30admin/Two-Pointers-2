// In this approach, we are using two pointers i and j both at index 1, comparing the current index value with previous index value, 
// if equal incrementing the count and if not then resetting the count to 1, indicating a new value. So, now if count is <=2, put the 
// value at i to the place where j is.

// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int removeDuplicates(int[] nums) {
        // Base case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Pointer j which will hold the position where the result values should come
        // in.
        int j = 1;
        // Count variable for count of each unique value
        int count = 1;
        // Run a loop from index 1 to n
        // Pointer i will be for comparing each value
        for (int i = 1; i < nums.length; i++) {
            // If curr is same as previous
            if (nums[i] == nums[i - 1]) {
                // Then increment count
                count++;
            } else {
                // Else reset count for unique value
                count = 1;
            }
            // Check is count <=2?
            if (count <= 2) {
                // Yes, then put value at i to the place where j is
                nums[j] = nums[i];
                // Increment j
                j++;
            }
        }
        // Return j
        return j;
    }
}