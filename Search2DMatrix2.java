//Time Complexity : O(m * n) where m is the number of rows and n is the number of columns in the matrix.
// Space Complexity : O(1) since we are not using any additional space for the result.

//Leetcode problem : https://leetcode.com/problems/search-a-2d-matrix-ii/

/**
 * Searches for a target value in a 2D matrix where each row and column is sorted.
 * Starts from the top-right corner and eliminates rows or columns based on comparisons.
 * Returns true if the target is found, otherwise returns false.
 */

public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0; 
        int j = matrix[0].length-1; 

        while( i < matrix.length && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            }
            else if(matrix[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}
