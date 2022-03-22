// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// creating an insert pointer and loop through arr
// check the previous 2 elements with current iteration
// if not equal, update value and increment insert

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int insert = 0;
       
        for (int num : nums) {
            
            if (insert < 2 || nums[insert-2] != num) {
                nums[insert] = num;
                insert++;
            }    
        }        
        return insert;
    }
}