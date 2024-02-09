// Time Complexity : O(n)
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach -:
By following two pointer approach, I am able to stop one pointer if threshold (k) reached.

Fast pointer traverses over the array, and check whether there are any repeated elements
which are less than 2, if it less than 2, we update slow pointer index with element at the
fast pointer index.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int slowPtr = 0;
        int fastPtr = 0;

        int count = 0;

        while(fastPtr < nums.length) {
            if(slowPtr == 0 || nums[fastPtr] != nums[fastPtr - 1]) {
                count = 1;
            } else {
                count++;
            }

            if(count <= 2) {
                nums[slowPtr++] = nums[fastPtr];
            }

            fastPtr++;
        }

        return slowPtr;
    }
}
