class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null ||matrix.length==0)
            return false;
        
        int n = matrix[0].length;
        int m=matrix.length;
        int i=0;
        int j=n-1;
        
        while (i<m && j>=0){
            if (matrix[i][j] == target)
                return true;
            else if (target < matrix[i][j])
                j -= 1;
            else
                i += 1;
        }
        return false;
    }
}
