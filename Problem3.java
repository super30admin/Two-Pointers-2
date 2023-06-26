// Time Complexity : O(n+m)
// Space Complexity : O(1)
    // n and m are rows and columns of the given matrix.

// Your code here along with comments explaining your approach
    //We use an approach called "Search Space Reduction". Here we reduce the search space by eliminating rows or columns based on the number at the current index. 
    //We choose either bottom-left or top-right, because we need to pick a corner where adjacent sides are sorted in different directions.
    //If we start at top-right, at every iteration, if the number is lower than the target we discard the row(we move down), otherwise we discard the column(we move left). In this way, we can traverse from top-right to bottom-left exploring those rows and columns where we can find the target.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = m-1;
        while(i<n&&j>=0)
        {
            if (matrix[i][j]==target)
            {
                return true;
            }
            else if (matrix[i][j]<target)
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