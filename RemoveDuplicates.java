// Approach: Slow and fast pointers
// Time: O(N)
// Space: O(1)
class Solution {
    private static final int MAX_DUPLICATES = 2;
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 0;
        while (fast < nums.length) {
            if (fast != 0 && nums[fast] == nums[fast - 1]) {
                count ++; // increase count
            } else {
                count = 1; // reset count
            }
            if (count <= MAX_DUPLICATES) {
                // copy elements
                nums[slow] = nums[fast];
                slow ++;
            }
            fast ++;
        }
        return slow; // size of the resultant array
    }
}