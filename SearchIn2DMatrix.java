/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Time Comlexity O(m+n) space O(1)
 */
public class SearchIn2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
        {
            return false;
        }
        int n=matrix[0].length;
        int m=matrix.length;
        int i = 0;
        int j = n-1;

        while(i < m && j>=0){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    
}
