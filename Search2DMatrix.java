//Time Complexity:O(m+n)
//Space Complexity:O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row =0, col = n-1, value;
        while(row < m && col >= 0  ){
            value = matrix[row][col];
            if(value == target)
                return true;
            else if(value < target)
                row++;
            else
                col--;
        }

        return false;

    }
}