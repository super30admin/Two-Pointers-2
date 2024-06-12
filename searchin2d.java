// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null ){
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        while( i < matrix.length &&   j > -1 ){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] > target){ // greater than target
                j--; // going left
            }else{
                i++; // going down
            }
        }
        return false;
    }
}
