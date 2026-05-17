// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
    I start from the last element of the first row of the matrix. Since the matrix is both column and row sorted, any element greater than my current element would lie in the column below the element
    and any smaller element would lie on the row before the element. Using this knowledge, I traverse through the array while my row index is less than total number of rows and column index is greater
    than or equal to 0
*/

public class Solution
{
    public bool SearchMatrix(int[][] matrix, int target)
    {
        int rows = matrix.Length, columns = matrix[0].Length;
        int i = 0, j = columns - 1;

        while (i < rows && j >= 0)
        {
            if (matrix[i][j] == target)
            {
                return true;
            }

            else if (matrix[i][j] < target)
            {
                i += 1;
            }

            else
            {
                j -= 1;
            }
        }

        return false;
    }
}