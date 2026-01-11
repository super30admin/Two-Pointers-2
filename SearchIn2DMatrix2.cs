public class Solution {

    // Time Complexity:
    // O(m + n)

    // Space Complexity:
    // O(1)

    // Start from the top-right corner of the matrix.
    // If the number is bigger, move left; if smaller, move down.
    // Keep checking until you find the target or exit the matrix bounds.
    public bool SearchMatrix(int[][] matrix, int target)
    {
        int m = matrix.Length;
        int n = matrix[0].Length;
        int r = 0; int c = n - 1;
        while (r < m && c >= 0)
        {
            if (matrix[r][c] == target)
            {
                return true;
            }
            else if (target < matrix[r][c])
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return false;
    }
}