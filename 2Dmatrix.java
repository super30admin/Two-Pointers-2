# Time complexity:O(m+n)
# Space complexity: 0(1)
# Did code run successfully on leetcode: yes
# Any problem you faced: No


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1;
        while(col >= 0 && row <= matrix.length - 1){
            if(target == matrix[row][col])
                return true;

            if(target > matrix[row][col])
                row++;

            else
                col--;
        }

        return false;
    }
}