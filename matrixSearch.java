
// Time Complexity :O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

start from the bottom left corner if target is greater than move to next column else move to the previous row. 

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length -1;
        int col = 0;
        while(row >= 0 && col <matrix[0].length)
        {
            if(matrix[row][col] > target)
            {
                row--;
            }
            else if(matrix[row][col] < target)
            {
                col++;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}