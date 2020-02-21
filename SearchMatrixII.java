
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

/*
Approach: One pointer at [0][n-1] or [m-1][0]
========
1. Pick either first row,last column element or last row, first column element to start with 
( Reason is: we can always pick a direction based on whether value is greater or less than target)
2. Picked first row, last column element here, so
    i. If target less than value, move pointer to left column (j--)
    ii. If target greater than value, move pointer to next row (i++)
    iii. Return true if value equal to target
3. Return false if target not found
*/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1; //picked element at last column, first row
        while( i < m && j >= 0) { 
            if(matrix[i][j] == target)  //return if value is equal to target
                return true;
            else if(matrix[i][j] < target) //move pointer to next row if target greater than value at index i,j
                i++;
            else j--; //move pointer to previous column if target less than value at index i,j
        }
        return false;
    }
}