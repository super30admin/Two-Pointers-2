// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if((matrix == null) && (matrix.length ==0 && matrix[0].length ==0)) return false;
        int col = matrix[0].length;
        int row = matrix.length;
        int ridx = 0;
        int cidx = col-1;
        boolean res = false;
        while(ridx<=row-1 && cidx>=0)
        {
            if(matrix[ridx][cidx]==target){
                res = true;
                break;
            }
            else if(matrix[ridx][cidx]>target)
            {
                cidx--;
            }
            else
                ridx++;
        }
        return res;
    }
}