//TC - O(m+n)
// SC - O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int r = 0;
        int c = n-1;
        
        while(r<=m-1 && c>=0){
            
            if(matrix[r][c] < target){
                r++;
            }
            else if (matrix[r][c] > target){
                c--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}