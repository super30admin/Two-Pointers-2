// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class RemoveDuplicatesSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int repCount = 1;
        int slowPtr = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                repCount++;
            } else {
                repCount = 1;
            }
            if (repCount <= 2) {
                nums[slowPtr] = nums[i];
                slowPtr++;
            }
        }
        return slowPtr;
    }
}