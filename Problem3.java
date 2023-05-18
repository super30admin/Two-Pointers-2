// Time: O(m+n)
// Space: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        
        int n = matrix[0].length;
         int r = 0; int c = n-1;
        while(r < matrix.length && c>=0){
            
            if(matrix[r][c] ==target) return true;
            if(matrix[r][c]> target){
                c--;
            }else{
                r++;
            }
        }
        return false;
        
    }
}