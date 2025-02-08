// timeComplexity - O(m+n)
// space Complexity - O(1)
public class Solution
{
    public bool SearchMatrix(int[][] matrix, int target)
    {
        if (matrix == null || matrix.Length == 0)
        {
            return false;
        }
        int m = matrix.Length;
        int n = matrix[0].Length;

        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0)
        {
            if (matrix[i][j] == target)
            {
                return true;
            }
            else if (target < matrix[i][j])
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