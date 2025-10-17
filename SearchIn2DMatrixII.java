// 240. Search a 2D Matrix II
// https://leetcode.com/problems/search-a-2d-matrix-ii/description/

/**
 * Time Complexity :  O(n + m) where n is no. of rows and m is no. of columns
 * Space Complexity : O(1) since we dont take any extra space
 */


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Select right top corner
        int row = 0;
        int col = matrix[row].length - 1;

        // reach closer to the target
        while(row < matrix.length && col >= 0){ 

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }


        return false;
    }
}