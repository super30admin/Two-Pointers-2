// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int k = 2; // Maximum number of allowed duplicates
        int slowPtr = 0; // Pointer to track the position of the next unique element
        int count = 1; // Counter to keep track of the number of occurrences of the current element

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                count++; // Increment count if the current element is the same as the previous element
            } else {
                count = 1; // Reset count if the current element is different from the previous element
            }

            if (count <= k) {
                nums[slowPtr] = nums[i]; // Place the current element at the position indicated by slowPtr
                slowPtr++; // Increment slowPtr to the next position for the next unique element
            }
        }

        return slowPtr; // Return the number of elements after removing duplicates
    }
}
