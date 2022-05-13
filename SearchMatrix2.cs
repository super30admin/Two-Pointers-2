using System;
namespace Algorithms
{
    public class SearchMatrix2
    {
        /// Time Complexity : O(M+N)
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Based on the discussion in class
        public bool SearchMatrix(int[][] matrix, int target)
        {
            if (matrix == null) return false;
            int m = matrix.Length;
            int n = matrix[0].Length;

            int i = 0, j = n - 1;

            while (i <= m - 1 && j >= 0)
            {
                if (matrix[i][j] == target) return true;

                if (target > matrix[i][j])
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
            return false;

        }
    }
}
