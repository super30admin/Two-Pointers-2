// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Using two pointers, slow and fast pointers. Slow pointer would point at the element which would be replaced. Fast pointer skips over elements after it finds two duplicates, when it finds the two duplicates, element at slow pointer is replaced by element at fast pointer

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        // Slow and fast pointer starting from 1 index as 0 index would always be unique
        // as it is the first index
        int slow = 1;
        int fast = 1;
        // Count to keep track on the number of duplicates
        int count = 1;
        // Run the loop till fast pointer reaches the end
        while (fast < nums.length) {
            // Increment count if duplicate is found else reset count
            if (nums[fast] == nums[fast - 1]) {
                count++;

            } else {
                count = 1;
            }

            // If count is less than three replace the element at slow pointer
            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            } else {
                fast++;

            }
        }

        return slow;
    }
}