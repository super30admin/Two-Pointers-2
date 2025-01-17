/*This is most optimized solution of Time complexity O(m+n)
Space Complxity -> O(1)

So here we took the top right element and made the approach
*/

/*
So in both the case we are taking the extreme element such that in one direction it's increasing and in other direction it's decreasing
*/
class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        // so here we are having two pointers
        int row = 0;
        int col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }

        }
        return false;
    }
}

/*
Time complexity O(m+n)
Space Complxity -> O(1)

So here we took the bottom left element and made the approach
*/
class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        // so here we are having two pointers
        int row = m - 1;
        int col = 0;
        while (row >= 0 && col < n) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                row--;
            } else {
                col++;
            }

        }
        return false;
    }
}

/*
This Solution is based on binary search on each row.
Time COmplexity -> O(mlogn) here we have m rows and n columns
Space Complexity -> O(1)
*/
class Solution3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (target > matrix[i][mid]) {
                    low++;

                } else {
                    high--;
                }

            }

        }

        return false;

    }
}