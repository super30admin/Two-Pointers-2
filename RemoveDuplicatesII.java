//Time Comlexity: O(n), where n is the length of the input array.
// Space Complexity: O(1), as we are modifying the input array in place and not using any additional data structures.
// LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

/**
 * Sorts an array containing 0s, 1s, and 2s in-place using the Dutch National Flag algorithm.
 * 1. It utilizes three pointers: `p0` for 0s, `curr` for current position, and `p2` for 2s.
 * 2. It iterates through the array, swapping elements to place them in their correct positions in a single pass.
 */

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int n = nums.length;
        int fast = 0;
        int slow = 0;
        int count = 0;
        while (fast < n) {
            if (fast != 0 && nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= k) {
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
