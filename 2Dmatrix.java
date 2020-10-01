
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int row = matrix.length - 1;
        int col = 0;
        while(row >=0 && col < matrix[0].length){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}
// Your code here along with comments explaining your approach
