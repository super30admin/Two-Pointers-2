
// Time Complexity : O(row+column)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Basic idea here is to move below if target is greater as the row and column are in sorted order.
// but if the target is smaller then move left. Return true if target if found else false.

// Your code here along with comments explaining your approach
public class SearchIn2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0; // starting positions
        int column = matrix[0].length-1; // starting positions

        // if target is greater then current then go down, if not go left
        while(row < matrix.length && column >= 0){
            // to avoid ArrayIndexOutOfBoundsException
            if(target > matrix[row][column]) {
                // go down
                row++;
            } else if(target < matrix[row][column]) {
                // go left
                column--;
            } else {
                return true;
            }
        }
        return false;
    }
}
