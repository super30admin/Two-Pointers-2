
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*

This approach efficiently searches for a target in a 2D matrix sorted row-wise and column-wise.
Starting from the top-right corner, we compare the current element with the target.
If the element is greater than the target, we move left to decrease the value;
if it is smaller, we move downward to increase the value.
This ensures that every step eliminates an entire row or column,
leading to an optimal O(m + n) time complexity.
The algorithm is space-efficient, using only constant extra space, making it an
effective solution for large matrices.


*/

class SearchIn2dMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length - 1;

        int m=matrix.length;
        int n=matrix[0].length;

        while(row<m && col>=0)
        {
            int element=matrix[row][col];
            if(element > target)
                col--;
            else if(element < target)
            {
                row++;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}