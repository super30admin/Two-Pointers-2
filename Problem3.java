// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach: Using a pointer to represent the index. If the value is greater than target value move down else left

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0){
            return false;
        }
    int row = 0;
    int col = matrix[0].length-1;
        while(col >= 0 && row < matrix.length){
            if(matrix[row][col] == target) {
               return true;
            }
            else {
                if(matrix[row][col] > target)  {
                    col--;
                }
                else  {
                    row++;
                    }
            }
        }
        return false;
    }
}
