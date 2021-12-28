//Time Complexity: O(n+m)
//Space Complexity: O(1)
// starting from top right
public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        int n = matrix.length, m= matrix[0].length;
        // we can only start from corners where we can have two distinct 
        // decision making params.
        int i = 0 , j = m-1;
        while(i < n && j >= 0)
        {
            int currVal = matrix[i][j];
            if(currVal == target)
                return true;
            else if (target > currVal)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return false;
    }
}

// starting from bottom left
public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        int n = matrix.length, m= matrix[0].length;
        // we can only start from corners where we can have two distinct 
        // decision making params.
        int i = n-1 , j = 0;
        while(i >= 0 && j < n)
        {
            int currVal = matrix[i][j];
            if(currVal == target)
                return true;
            else if (target > currVal)
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
