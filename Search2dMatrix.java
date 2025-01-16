//Time complexity : O(m+n)
//Space Complexity : O(1)
// Did the code run in leetcode : yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n-1;
        while(row < m && col >=0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }

        return false;
    }
}