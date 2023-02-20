// Time Complexity :
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : O(1)
// Three line explanation of solution in plain english
//used 2pointers to traverse and a flag to determine the 
//the repeated numbers in the consecutive order

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int ind = 1;
        boolean flag = true;
        while (ind < nums.length) {
            if (nums[start] == nums[ind] && flag) {
                nums[++start] = nums[ind++];
                flag = false;
            } else if (nums[start] != nums[ind]) {
                nums[++start] = nums[ind++];
                flag = true;
            } else {
                ind++;
            }
        }
        return ++start;
    }
}