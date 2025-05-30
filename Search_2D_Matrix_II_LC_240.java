/* Time cimplexity - O(m+n)
   Space complexity - O(1)
   Did this code successfully run on LeetCode :  Yes
Any problem you faced while coding this :  No
  */
public class Search_2D_Matrix_II_LC_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col = n-1;
        int row = 0;
        while(row < m && col >=0){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) {
                row++;
            } else{
                col--;
            }
        }
        return false;
    }
}