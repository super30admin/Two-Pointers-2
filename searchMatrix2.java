/*
Time complexity : O(m+n)
Space complexity: O(1)
*/
public class searchMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        /* traverse from top right corner and if the value is 
            greater than target, decrease the column else 
            increment the row.
        */
        while(col >= 0 && row < matrix.length) {
            if(matrix[row][col] > target) {
                col--;
            } else if(matrix[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}