
/**
 * Removes duplicates from a sorted array such that each unique element appears at most twice.
 * Modifies the input array in-place and returns the new length.
 *
 * Problem:
 * - Given a sorted integer array `nums`, remove duplicates in-place such that
 *   each element appears at most `k` times (k = 2 in this case).
 * - The relative order of the elements should be kept the same.
 *
 * Approach:
 * - Use a two-pointer technique:
 *   - `slow` keeps track of the position to write the next allowed number.
 *   - `count` tracks how many times the current number has occurred.
 * - If `count` is less than or equal to `k`, copy the number to `slow` and increment `slow`.
 *
 * Time Complexity: O(n)
 * - Single pass through the array.
 *
 * Space Complexity: O(1)
 * - In-place operation with constant extra space.
 */

import java.util.Arrays;

public class remove_duplicates {
    public static int removeDuplicates(int[] nums) {
        int slow = 1;
        int count = 1;
        int k = 2;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= k) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums_1 = { 1, 1, 1, 2, 2, 3 };
        int[] nums_2 = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };

        System.out.println(removeDuplicates(nums_1));
        System.out.println(Arrays.toString(nums_1));
        System.out.println(removeDuplicates(nums_2));
        System.out.println(Arrays.toString(nums_2));
    }
}
