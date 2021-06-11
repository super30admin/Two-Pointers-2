
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* 
 1. Keep three pointers.
 2. If count>k then replace the element at i with the 'pointer' and increment it
*/

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int k = 2;
        int pointer = 1; int count = 1;
        int n = nums.length;
        for(int i=1;i<n;i++) {
            if(nums[i] == nums[i-1])
                count++;
            else {
                count = 1;
            }
            
            if(count <= k) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }
}
