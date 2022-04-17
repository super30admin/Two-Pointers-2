//TC: O(m+n) SC:(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;

        int r = matrix.length - 1;
        int c = 0;

        while(r >=0 && c<=matrix[0].length-1)
        {
            if(matrix[r][c] == target)
                return true;
            else
            if(matrix[r][c] > target)
                r--;
            else
                c++;
        }

        return false;
    }
}