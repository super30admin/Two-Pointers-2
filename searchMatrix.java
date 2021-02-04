// Time complexity O(m + n)
// Works on leetcode

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if ((matrix == null) || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
        int m = matrix[0].length;
        int n = matrix.length;
        int i = 0;
        int j =  m - 1;
        while(i <  n && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            else if (matrix[i][j] < target){
                i = i + 1;
            }
            else{
                j = j - 1;
            }
        }
        return false;
    }
}
