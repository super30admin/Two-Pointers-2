
// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// got throught each index row by row and colomn by colomn, and  if the target value is less the the value we are looking we move to the new row, and start from the first index of that column.
// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = 0;
        while(i < m){
            if( i < m && j < n && matrix[i][j] == target ){ // if the value is found we return
                return true;
            }else if( j < n && matrix[i][j] < target ){ // if target is less them move to next
                j++;                                    // colomn
            }else{
                i++;                                    // else go to new row and zero colomn
                j = 0;
            }
        }
        return false; // return false if not found
    }


}