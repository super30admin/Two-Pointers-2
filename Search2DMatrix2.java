// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Visualize 2D matrix as a 1D array. Eliminate each row by comparing target with last element. If the target is greater than last in row, increment row
//else increment col
public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //edge case
        if(matrix.length==1) {
            for(int i : matrix[0])
                if(target==i) return true;
            return false;
        } else if(matrix[0].length==1){
            int row =0;
            while(row<matrix.length){
                if(matrix[row++][0]==target) return true;
            }
            return false;
        }


        int row = 0, col = matrix[0].length -1;
        while(row < matrix.length && col >= 0){
            if(target==matrix[row][col]) return true;
            else if(target > matrix[row][col]) row++;
            else col--;
        }
        return false;
    }
}
