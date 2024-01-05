/*
* Approach:
*  1. Start from the top-right corner.
*       if target == element, return true

*  2. If  target < element, move left 
* 
*  3. If target > element, move right
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(m+n)
* 
* Space Complexity: O(1)
* 
*/

public class Search2DmatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;

            else if (matrix[row][col] < target)
                row++;

            else
                col--;
        }

        return false;
    }
}
