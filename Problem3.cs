public class Solution
	{
        // Time Complexity : O(m + n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public bool SearchMatrix(int[][] matrix, int target)
        {
            if (matrix == null || matrix.Length == 0) return false;
            int m = matrix.Length;
            int n = matrix[0].Length;
            int i = 0;
            int j = n - 1;

            while(i < m && j >= 0)
            {
                if (target == matrix[i][j])
                    return true;
                else if(target < matrix[i][j])
                {
                    j--;
                }
                else
                {
                    i++;
                }
            }
            return false;
        }
    }
