
// Time Complexity : O(m * Log N base 2)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*

Stating from top right-most element 

IF ELEMENT IS TARGET - Return true

If target is smaller then -> Go in previous column 
Otherwise go in the next row.



If element not found, return false
*/

// Your code here along with comments explaining your approach



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null)  return false;
        
        int i = 0, j = matrix[0].length - 1;
        
        while( i <= matrix.length - 1 && j >= 0 && j <= matrix[0].length - 1){
            if( matrix[i][j] == target) return true;
            else if( matrix[i][j] < target )  i++;
            else  j--;
        }
        
        return false;
        
    }
}