/*
Two Pointers
Time Complexity : O(n) where n is the length of the input array nums
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Intuition: Since the array is sorted, we can use a two-pointer approach to keep track of the last valid position and the current position. We allow at most two duplicates of each number.
*/

public class RemoveDupsSortedII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;

        int i = 2; // Start from the third element
        for (int j = 2; j < nums.length; j++) {
            // If the current element is not a duplicate of the last two elements
            if (nums[j] != nums[i - 2]) {
                nums[i++] = nums[j]; // Place it in the next position
            }
        }
        return i; // Return the new length
    }

    public static void main(String[] args) {
        RemoveDupsSortedII solution = new RemoveDupsSortedII();
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int newLength = solution.removeDuplicates(nums);

        // Print the modified array up to the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
