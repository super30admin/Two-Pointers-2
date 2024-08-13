// Approach-
// we know for a fact that the intervals between the two rows are not sorted.
// so we cnanot place it all in a linear fashion.
// the [0][0] and [m-1][n-1] matrix are not worth because you can both increase it or decrease it from there.
// you cannot either increase or decrease(like do both) by moving up and down a row or a column from there.
// so ignore them.

// The star is [m-1][0] or [0][n-1] matrix.pick them and get started.
// Time complexity = O(m+n) // worst situation when the number is at a different corner.
// space complexity = O(1) // no auxiliary space.
class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // m x n matrix
        int m = matrix.length;
        int n = matrix[0].length;
        /**
        // we start from bottom most - left most.
        int r = m-1;// last row.
        int c =0;// first column.
        while(r>=0 &&  c<= n-1) {
            if(matrix[r][c] == target) {
                return true;
            } else if(matrix[r][c]> target) {
                r--;
            } else {
                c++;
            }
        }
        **/
        
        // we start from top most - right most.
        int r = 0;// first row.
        int c =n-1;// last column.
        while(r<=m-1 &&  c>=0) {
            if(matrix[r][c] == target) {
                return true;
            } else if(matrix[r][c]> target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}