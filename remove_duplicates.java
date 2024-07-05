// Time Complexity : o(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0; // Index for placing the next unique or allowed duplicate element
        int count = 1; // Count the occurrences of the current element
        
        // Loop through the array starting from the second element
        for (int counterIdx = 1; counterIdx < nums.length; counterIdx++) {
            // If the current element is the same as the previous one, increment the count
            if (nums[counterIdx] == nums[counterIdx - 1]) {
                count++;
            } else {
                // If the current element is different, reset the count to 1
                count = 1;
            }
            
            // If the count is less than or equal to 2, it's allowed to be in the array
            if (count <= 2) {
                idx++; // Move to the next position
                nums[idx] = nums[counterIdx]; // Place the current element at the new position
            }
        }
        
        // Return the length of the array with duplicates removed or allowed up to twice
        return idx + 1;
    }
}
