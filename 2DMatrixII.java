// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length; //Calc the row
        int col = matrix[0].length; //Calc the col
        int r = 0;
        int c = col - 1; //Pointer is at the last col of the first row

        while(r <= row - 1 && c >= 0){  //While it reaches the elem at last row and the first col
            if(matrix[r][c] == target) return true; //If the target matches the elem return true

            if(target < matrix[r][c]){
                c--; //As the elems are sorted if target is less than the current elem than col --
            }
            else
            {
                r++; //Otherwise row--
            }
        }
        return false;
    }
}