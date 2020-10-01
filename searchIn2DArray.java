
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }

        int row = 0, column = matrix[0].length-1;

        while(column>=0 && row<=matrix.length-1)
        {
            if(matrix[row][column] == target)
            {
                return true;
            }
            if(matrix[row][column]>target)
            {
                column--;
            }
            else
            {
                row++;
            }
        }

        return false;
    }
}
