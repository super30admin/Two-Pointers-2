//Time Complexity : O(m+n) where m and n are no. of rows and columns of matrix respectively
//Sapce Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//We will start from top right corner. If the target is greater than matrix[i][j] then it means target is not present in that row; so we will move to next row . Else if target is smaller than matrix[i][j then we will move to previous column. We can start from bottom left corner as well . But we cannot start from top left corner or bottom right corner because we will not have any decision to make in which direction to go.

//CODE:

public class search_a_2Dmatrix_2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // null case
        if (matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0, j = n - 1; // starting from top right corner

        while (i < m && j >= 0) {
            if (matrix[i][j] == target) { // if target is found we will return true
                return true;
            } else if (matrix[i][j] < target) { // if target is greater than value in matrix at i,j then it means target
                                                // is not present in that row , so we will move to next row
                i++;
            } else {
                j--; // else we will move to previous column if target is msaller than martix[i][j]
            }
        }
        return false;
    }
}
