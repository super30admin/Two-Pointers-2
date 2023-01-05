// Remove Duplicates from Sorted Array II
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// Consider two pointers (slow & i) and count(to keep track of occurance)
// until count hit the max no. duplicate value(which is 2) override fast pointer(i) element to slow pointer & increase slow pointer.
// when current index & next index elements are different, reset the count to 1.

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int count = 1;
        int slow = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1])
                count++;
            else
                count = 1;

            if(count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }

        }
        return slow;
    }
}