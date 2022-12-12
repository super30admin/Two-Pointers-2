// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        if(matrix ==  null || matrix.Length == 0) return false;
        int m = matrix.Length; int n = matrix[0].Length;
        int i = 0; int j = n-1;
        while( i < m && j >= 0)
        {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target)
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
