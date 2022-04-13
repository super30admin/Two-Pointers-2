/**
Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
TC: O(n)
SC: O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        
        int nd = 0, count = 1;
        
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i-1]) {
                ++count;
            } else {
                count = 1;
            }
            
            if (count <= 2) {
                nums[++nd] = nums[i];
            }
        }
        return nd + 1;
    }
}
/**
can change the condition to count <= n (duplciates at max) to generalize the problem
*/