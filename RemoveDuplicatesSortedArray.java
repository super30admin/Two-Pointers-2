// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Idea: Moving elements to the front if their current count is less than or equal to 2.
// We achieve this by using two pointers; one to traverse (fast); one to keep track of where
// the new element should be moved to (slow). Everything is up to the mark left of slow; so whenever
// we replace slow with an element; we move slow.

// Your code here along with comments explaining your approach

class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int fast = 0;
        int slow = 0;
        int count = 0;

        while (fast < nums.length) {
            if (fast == 0 || nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                // encountered new element
                count = 1;
            }
            if (count <= 2) {
                // valid input; move it to the front
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }
}