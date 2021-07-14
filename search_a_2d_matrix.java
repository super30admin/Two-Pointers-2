class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix[0].length==0)
        {
            return false;
        }
        
        int i= 0;
        int j= matrix[0].length-1;
        
        while(i<matrix.length && j>=0)
        {
            if(target < matrix[i][j])
            {
                j--;
            }
            else if(target > matrix[i][j]){
                i++;
            }
            else{
                return true;
            }
        }
    return false;
    }
}
