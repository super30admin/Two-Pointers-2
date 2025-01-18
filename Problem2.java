public class Problem2 {
// Time Complexity : O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YEs
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int m =  matrix.length;//row length
        int n = matrix[0].length;//col length
        int row = 0;
        int col = n-1;
        //we're starting from 0th row and last col and go down if the target is greater and left if target is small
        while(row < m && col >=0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
