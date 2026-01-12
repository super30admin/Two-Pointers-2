// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just needed to allow only 2 duplicates and shift in-place.


// Your code here along with comments explaining your approach in three sentences only
// Since array is sorted, same numbers come together, so we can control how many times we keep them.
// I use a write pointer and allow a number only if it is different from nums[write-2] (means max 2 allowed).
// This updates the array in-place and returns the new length.

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2) return nums.length;

        int write = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[write - 2]) {
                nums[write] = nums[i];
                write++;
            }
        }

        return write;
    }
}
