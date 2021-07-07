/**
 * Use 2 pointers to solve this problem. Slow would track the position where the
 * element would be inserted, and fast goes ahead and provides element to be
 * inserted at index of slow.
 * 
 * Time Complexity: O(n) 
 * Space Complexity: O(1)
 * 
 * Leetcode Results:
 * 
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array II.
 * Memory Usage: 37.1 MB, less than 100.00% of Java online submissions for Remove Duplicates from Sorted Array II.
 * 
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        for (fast = 0; fast < nums.length; fast++) {
            // if slow < 2, for first 2 indices, roll over
            // if nums[fast] > nums[slow-2] means that element at fast should be inserted at
            // index slow
            if (slow < 2 || nums[fast] > nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}