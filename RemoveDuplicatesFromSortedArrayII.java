
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// 1. Two pointer approach by keeping track of number of repeated elements

//80. Remove Duplicates from Sorted Array II (Medium) - https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int n = nums.length, count = 1, slow = 1;
        if (n == 1) return 1;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }
            
            // number of elements can be generalized to some limit
            if (count <= 2) { // count<= k
                nums[slow] = nums[i];
                slow++;
            }
        }
        
        return slow;
    }
}