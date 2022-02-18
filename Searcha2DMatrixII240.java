/*
Time complexity : O(m+n)
Space complexity: O(1)
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0){
            return false;
        }
        int m = 0;
        int n = matrix[0].length-1;
        
        while(m < matrix.length && n>=0){
            if(matrix[m][n] == target){
                return true;
            }

            else if(target > matrix[m][n]){
                m++;
            }
            else{
                n--;
            }
        
        }
        return false;
    }
}
