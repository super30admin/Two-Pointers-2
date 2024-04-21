
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * For a given range m1->n1 a number we can only be sure that 
 * if x is greater than n1 -> x does not lie in the range
 * if x is smaller than m1 -> x does not lie in the range
 * 
 * in a matrix if matrix[r][c] > target -> the traget doesnot lie in the array; so reduce column
 * if matrix[r][c]<target but not equal to target > increase row
 */

public class SearchIn2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return false;

    }
}