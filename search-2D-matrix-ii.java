//Time complexity: O(m+n), where m is the # rows and n is the # columns in the given matrix
//Space Complexity: O(1)
//running on leetcode:yes
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null)
        {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        //taking the lower left element as the starting point for the search
        int i=m-1, j=0;
        /*if upper right element is taken as the starting point
        i=0, j=n-1, j>=0,i<m,i++, j--
        */
        while (i>=0 && j<n)
        {
            if(matrix[i][j] == target)
            {
                return true;
            }
            else if (target > matrix[i][j])
            {
                j++;
            }
            else
            {
                i--;
            }
        }
        return false;
    }
}
