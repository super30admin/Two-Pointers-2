class Search2DMatrix-II {
    
    // Time Complexity: O(m + n)
    // Space Complexity: O(1)
    
    public boolean searchMatrix(int[][] matrix, int target) {
        // Edge Case Checking
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int row = 0;
        int col = cols-1;
        
        // We begin from top-right of the matrix and traverse till bottom-left
        while(row < rows && col >= 0){
            // If the target is found in the matrix --> return true
            if(matrix[row][col] == target)
                return true;
            // If the current matrix element is greater than target then decrease the column number
            else if(matrix[row][col] > target)
                col--;
            // If the current matrix element is less than target then increase the row number
            else
                row++;
        }

        // After the traversal of matrix --> if twe didn't find the target then return false
        return false;
    }
}