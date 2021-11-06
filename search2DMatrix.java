// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
import java.util.*;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length-1;
        
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] < target) {
                row++;
            }
            else if(matrix[row][column] > target) {
                column--;
            }
            else {
                return true;
            }
        }
        return false;
    }
}