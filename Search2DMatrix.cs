using System;
using System.Collections.Generic;
using System.Text;

namespace MultidimensionalArray
{
    //Time Complexity: O(m+n)
    //Space Complexity: O(1)
    class Search2DMatrixIILC
    {
        public bool SearchMatrix(int[][] matrix, int target)
        {
            if (matrix == null || matrix.Length == 0)
            {
                return false;
            }
            int m = matrix.Length;
            int n = matrix[0].Length;
            int i = m - 1, j = 0;
            while (i >= 0 && j < n)
            {
                if (matrix[i][j] == target)
                {
                    return true;
                }
                else if (target > matrix[i][j])
                {
                    j++;
                }
                else
                {
                    i--;
                }
            }
            return false;
        }
    }
}
