// Time Complexity : O(m + n) m is rows and n is columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:

// 1. Start from the top-right corner of the matrix.
// 2. If the current element is the target, return true; if it's smaller, move down; if it's larger, move left.
// 3. Repeat until the target is found or the search goes out of bounds (matrix traversal ends).


public class Matrix 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int il = 0;
        int jl = matrix[0].length-1;
        while(il<matrix.length && jl>=0)
        {
            if(matrix[il][jl]==target)
            {
                return true;
            }
            else if((matrix[il][jl]<target))
            {
                il++;
            }
            else
            {
                jl--;
            }
        }
        return false;
    }
}