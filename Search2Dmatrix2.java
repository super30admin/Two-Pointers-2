// Time Complexity : O(n*m) where n - rows , m - columns in the matrix.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
Start from the top right cell of the matrix. Traverse through the matrix, 
increment the row if target is less than current cell and decrement the col if target is greater than the current cell.
Since each row is increasing and each col is in increasing order. The last element in the row need not be less than the first element in the next row.
*/

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length,m=matrix[0].length;
        int r = 0,c=m-1;
        while(r<=n-1 && c>=0){
            if(target == matrix[r][c]) return true;
            else if(target < matrix[r][c]) c--;
            else r++;
        }
        return false;
    }
}
