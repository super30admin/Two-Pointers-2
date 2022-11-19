// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//taking the last element of 1st row and checking if it is greater than target then moving left col--
//if less then target then moving down row++
//if match found then return true, if not found by end of last row and 1st col, then return false

// Your code here along with comments explaining your approach

//240. Search a 2D Matrix II
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int l = n - 1, d = 0;
        while(l >= 0 && d <= m - 1){
            if(matrix[d][l] == target){
                return true;
            }
            else if(matrix[d][l] > target){
                l--;
            }
            else{
                d++;
            }
        }
        return false;
    }
}