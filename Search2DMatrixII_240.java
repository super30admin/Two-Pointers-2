
// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Search2DMatrixII_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        
        int n= matrix.length;
        int m = matrix[0].length;
        
        int i=0;
        int j=m-1;
        
        while(i<n && j>=0 ){
            
                if(matrix[i][j]==target){
                    return true;
                }
                else if (matrix[i][j] > target){
                    j--;
                } else {
                    i++;
                }
            
        }
        
        return false;
    }
}

// O(n+m)
// O(1)