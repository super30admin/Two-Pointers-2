// Time Complexity : O(mXn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Traversing the 2 D matrix using the fact that both rows and columns 
// are individually sorted 

class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m-1; 
        int j = 0;
        while(i >= 0 && j < n){
            if(matrix[i][j] == target){
                return true;
                }else if(matrix[i][j] > target){
                i--; //move left
            }else{
                j++; //move down
            }
        }
        return false;
    }
}