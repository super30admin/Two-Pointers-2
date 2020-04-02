//time complexity: O(m*n) where m is the no of rows and n is the no. of cols
//space complexity: O(1)

class SearchA2DMatrixSolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length==0)
            return false;
        int i = 0, j = matrix[0].length - 1;
        
        while(i < matrix.length && j >= 0)
        {
            if(matrix[i][j] == target)
                return true;
            if (target > matrix[i][j])
                i++;
            else
                j--;
            
        }
        return false;
        
    }
}