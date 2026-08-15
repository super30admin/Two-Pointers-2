//Approach: Row elimination using binary search to find the element with O(m)+O(n)
//Time Complexity : O(m) + O(n)
//Space Complexity: O(1)

public class SearchTwoDMatrix
{
    public boolean searchMatrix(int[][] matrix, int target) {
        //Validate inputs
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0, c = n - 1;

        while (r < m && c >= 0) {
            //Target found
            if (matrix[r][c] == target) return true;
                // Since the rows are sorted, we can safely assume that the target lies on to the left side
            else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}

