
// Time Complexity : O(m+n-1) m length of row, n length of column
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english:
// Take two pointers and compare the elements until it reached 2 diagnols
// As its a sorted array in each column, and row, 
// If we start with top right, if taget > top right all elements below it in a index can be eliminated
// else all column beside it are eliminated

// Your code here along with comments explaining your approach


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Let us compare with 2 pointers one to top right
        int r = 0;
        int c = matrix[0].length - 1;

        // Now Lets try to compare elemenrts till row length + column length -1 times

        while ( r < matrix.length && c >=  0 ) {        // Compare until c >=0 and row < matrix length
            if ( target == matrix[r][c] ) {             // if target == matrix return its valid
                return true;
            }
            if  ( target < matrix[r][c] ) {             // if target < curret index reduce column as we eleneinte the elements below that column
                c--;                                    
            }
            else {                                      // else eliminate row 
                r++;                                    
            }
        } 
        return false;                                   // after all comparisions if no element return false
    }
}