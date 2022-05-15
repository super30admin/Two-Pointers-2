// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int col = nums[0].length-1;
        int row = 0;
        while(col>=0 && row <= nums.length-1){
            if(nums[row][col] == target) return true;
            if(nums[row][col] > target) col--;
            else row++;
        }
        return false;
    }
}