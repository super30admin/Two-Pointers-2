// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
/* start from [0,m] , move left or down as per the target
 * start from [n,0] , move up or right as per the target
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        
        int r = 0; int c = columnLength -1;
        
        while(r < rowLength && c >= 0){
            if(matrix[r][c] > target){
                c--;
            }
            else if(matrix[r][c] < target){
                r++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}