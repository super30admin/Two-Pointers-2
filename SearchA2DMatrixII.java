// Time Complexity : O(m+n) where m=no. of rows and n=no. of columns
// Space Complexity : O(1) not extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * Since elements in rows and columns are in sorted order, we will use it to our benefit.
 * We use two pointers, row and column
 * we start at the upper right corner in the matrix and update the row and column ie
 * if target greater than value there  we increment row else decrement columns
 * */


public class SearchA2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        //edge
        if(matrix==null || matrix.length==0){
            return false;
        }

        //start form the upper right corner of the matrix
        int row = 0;
        int column = matrix[0].length-1;

        while (row<matrix.length && column>=0){
            if(matrix[row][column]==target) return true;
            else if(target>matrix[row][column]) row++;
            else column--;
        }
        return false;
    }
}
