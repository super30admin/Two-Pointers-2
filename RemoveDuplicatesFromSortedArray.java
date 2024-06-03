// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// logic: Initialization:count keeps track of the number of occurrences of the current element.
//j is the index where the next valid element should be placed.
//Iterate Through Array: Traverse the array starting from the second element.
//If the current element is the same as the previous one, increment the count.
//If the current element is different, reset the count to 1.
//If count is less than or equal to 2, place the element at index j and increment j.
//Return the Length:The value of j will be the length of the modified array with each unique element appearing at most twice.

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;  // Return 0 if the input array is null or empty
        }

        int count = 1;  // Initialize count of occurrences of the current element
        int j = 1;  // Index for placing the next valid element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;  // Increment count if the current element is the same as the previous one
            } else {
                count = 1;  // Reset count if the current element is different
            }

            if (count <= 2) {
                nums[j] = nums[i];  // Place the element at the index j
                j++;  // Increment the index for the next valid element
            }
        }

        return j;  // Return the length of the array with duplicates removed
    }
}
