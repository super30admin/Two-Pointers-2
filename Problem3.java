//This uses the Staircase Search (Top-Right Search).
//
//Key idea:
//Start from top-right corner:
//If current > target → move left
//If current < target → move down
//If equal → found
//Because:
//Row is sorted → left is smaller
//Column is sorted → down is larger
//
//Time: O(m + n)
//Space: O(1)

class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        // Number of rows
        int m = matrix.length;

        // Number of columns
        int n = matrix[0].length;

        // Start from TOP-RIGHT corner
        int r = 0;
        int c = n - 1;

        // Traverse while inside matrix
        while(r < m && c >= 0) {
            // If target found
            if(matrix[r][c] == target)
                return true;

                // If current element is greater than target
                // move LEFT to smaller element
            else if(matrix[r][c] > target)
                c--;

                // If current element is smaller than target
                // move DOWN to larger element
            else
                r++;
        }
        // Target not found
        return false;
    }
}