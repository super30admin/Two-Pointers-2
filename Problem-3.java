
// Time Complexity : O(row+col)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// So exhausting condition will be row and col out of bound
// We apply kind of linear search from last row and first column and then we increase and decrease the row and col 
// according to the target elemnet and current element.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;
        
        while(row>=0 && row<matrix.length && col>=0 && col<matrix[0].length) {
            if(target == matrix[row][col]) {
                return true;
            }
            else if(target < matrix[row][col]) {
                row--;
            }
            else {
                col++;
            }
        }
        return false;
    }
}