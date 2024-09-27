/**
Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
TC: O(n)
SC: O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int slow = 1, fast = 1;
        int count = 1;
        
        for (fast = 1; fast < nums.length; ++fast) {
            if (nums[fast] == nums[fast - 1]) {
                ++count;
            } else {
                count = 1;
            }
            
            if (count <= 2) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
/**
can change the condition to count <= n (duplciates at max) to generalize the problem
*/