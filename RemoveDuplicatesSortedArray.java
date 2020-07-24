
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english :No
// Your code here along with comments explaining your approach



class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int count = 1;
        for( int j = 1 ;j < nums.length ; j++ ){
            if(nums[j]  == nums[j-1])
                count++;
            else
                count = 1;
            if(count <= 2)        
                nums[++i]  = nums[j];
        }
        return i+1;
    }
}