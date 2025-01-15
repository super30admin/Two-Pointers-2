/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove some duplicates in-place such that each unique element appears at most twice.
 * The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Ran on leetcode: yes
 * Issues faced? no
 *
 * Approach:
 * 1. "Check" pointer to iterate through the array and "start" pointer to write valid elements.
 * 2. Track consecutive duplicates using count
 * 3. Write nums[check] to nums[start] if count <= 2, then increment start.
 * 4. Return start as the new length
 *
 */
public class RemoveDupsFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 1; // Start writing from the second position
        int count = 1; // Count occurrences of the current number
        int check = 1; // Start checking from the second element

        while (check < nums.length) {
            if (nums[check] == nums[check - 1]) { // Compare consecutive elements
                count++;
            } else {
                count = 1; // Reset count for a new number
            }

            if (count <= 2) {
                nums[start++] = nums[check];
            }

            check++;
        }

        return start;
    }

    public static void main(String[] args) {
        RemoveDupsFromSortedArray2 obj = new RemoveDupsFromSortedArray2();
        int[] nums = {0,0,0,0,1,1,2,3,3,3,4,5,5,5};
        int k = obj.removeDuplicates(nums);
        int[] expected = {0,0,1,1,2,3,3,4,5,5};
        assert k == expected.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expected[i];
        }
    }
}
