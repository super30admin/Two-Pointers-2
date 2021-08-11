// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n - 1;
        while(j >= 0 && i < m){
            if(matrix[i][j] == target){
                return true;
            }
            else if(target > matrix[i][j]){
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
}