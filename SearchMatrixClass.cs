public class Solution
{
    public bool SearchMatrix(int[][] matrix, int target)
    {
        int m = matrix.Length, n = matrix[0].Length;
        int column = n - 1, row = 0;

        while (row < m && column >= 0)
        {
            if (matrix[row][column] == target)
            {
                return true;
            }
            else if (matrix[row][column] > target)
            {
                column--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
}