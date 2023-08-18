// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Here we are taking two pointer i will start from zero and j n-1(last colm). Will compare and move either by colum or by row.

class SearchIn2DMetrix{
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0) return false;
            int m = matrix.length;
            int n = matrix[0].length;
            //int idx = n-1;
            int i = 0;
            int j = n-1;
            while(i< m && j>=0){
                if(matrix[i][j] == target) return true;
                else if(matrix[i][j] < target){
                    i++;
                }else{
                    j--;
                }
            }
    return false;
    }
}