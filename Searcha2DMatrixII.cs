
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// This code searches for a target value in a sorted 2D matrix.
// It starts from the top-right corner and iterates either left or down based on comparisons with the target.
// If the target is found, it returns true; otherwise, it returns false after traversing the matrix.

public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.Length ==0) return false;
        int m = matrix.Length;
        int n = matrix[0].Length;

        int i=0;
        int j = n-1;

        while(i < m && j>=0)
        {
            if(matrix[i][j] == target)
            {
                return true;
            }
            else if(matrix[i][j] > target)
            {
                j--; // move left
            }
            else
            {
                i++; //down
            }
        }
        return false;
    }
}