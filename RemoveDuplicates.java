// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 1; // To count occurrences of each number
        int slow = 1; // Pointer to place the next valid element

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }

            // If count is less than or equal to 2, it means we can keep the current element in the array
            if (count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow; // Return the new length of the modified array

    }
}
