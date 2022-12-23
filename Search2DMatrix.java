class Search2DMatrix {
    /* Approach:As the each row is in ascending order and each column is in ascending order
        we can start our search either from top right corner or bottom left corner because 
        from there if can definitely decide to which side we can traverse eg. if my matrix[i][j]     < target  then I know i will have to move to right direction else i can move to upward direction.
        
        Time complexity : o(m+n)
        space complexity :(1)
    */

    public boolean searchMatrix(int[][] matrix, int target) {

        // I am starting from the bottom left corner
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = rows - 1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (matrix[row][col] == target)
                return true;
            if (target > matrix[row][col]) {
                col++;
            } else {
                row--;
            }

        }
        return false;
    }
}
        
}
