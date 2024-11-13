//240. https://leetcode.com/problems/search-a-2d-matrix-ii/description/
//Time Complexity: O(m+n)
//Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //base case
        if(matrix == null || matrix.length==0){
            return false;
        }

        //row = bottom left & col = 1st column
        int row = matrix.length-1, col = 0;

        while (row >= 0 && col < matrix[0].length)
        {
            if (matrix[row][col] > target){
                row--;  // traverse towards top
            }else if (matrix[row][col] < target){
                col++;  // traverse towards right
            }else{
                return true;  //present
            }
        }
        return false;
    }
}