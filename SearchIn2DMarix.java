
/**
Brute Force:  Linear search in2d array -> O(m*n)
Binary Search-> Each row we do BS-> O(m*logN)


Optimal-> One Pointer at either of two diagonal ends. [m,0].  and [0,n] and reduce row and columns acc to target.
TC - O(m+n), SC-O(1)
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r =0; int c= n-1;
        while(r<m && c>=0){
            if(matrix[r][c]==target){return true;}
            else if (matrix[r][c] <target){ r++;}
            else { c--; }
        }
        return false;
    }
}