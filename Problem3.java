/**
 * Time Complexity - O(m+n) - m=rows n = cols
 * Space Complexity - O(1)
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0){
            return false;
        }

        int row =  matrix.length-1, cols = matrix[0].length;
        int col = 0;
        while(row >=0 && col <cols){

            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] > target){
                row--;
            }else{
                col++;
            }

        }

        return false;
    }
}