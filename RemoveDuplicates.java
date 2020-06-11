
// Time Complexity : O(n) --> where n is length of input array
// Space Complexity : (1)
// Did this code successfully run on Leetcode (80): Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int j = 1;
        int count = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            }
            else count = 1;
            
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}