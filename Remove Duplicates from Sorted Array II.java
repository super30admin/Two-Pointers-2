
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain English
// Variable to track place to insert and variable to track how many same elements already inserted

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int a = 1;
        int b = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[a-1]){
                nums[a++] = nums[i];
                b = 1;
            } else if(b < 2){
                nums[a++] = nums[i];
                b++;
            }
        }

        return a;

    }
}
