//Time Complexity: O(m+n)
//Space Complexity: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;
        int row = 0;
        while(row <= rows) {
            if(cols < 0 || row > rows)
                return false;
            if(matrix[row][cols] == target)
                return true;
            else if(matrix[row][cols] > target)
                cols-=1;
            else
                row+=1;
        }

        return false;
    }
}