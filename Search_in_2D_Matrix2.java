/*

Time complexity : 
Space Complexity : O(1)
worked on leetcode  : YEs


*/
public class Search_in_2D_Matrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 ) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int col = n-1;
        
        while ( row <= m-1 && col >= 0){
            if(matrix[row][col] == target) return true;
            if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
            
        }
        return false;
    }
}