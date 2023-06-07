class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int r=matrix.length-1,c=0;
        while(r<matrix.length && c<matrix[0].length)
        {
            if(matrix[r][c]==target)
                 return true;//match found
            else if(r!=0 && matrix[r][c]>target)
                 r--; //discard row
            else
               c++;  //moving to the next column
        }
        return false;
    }
}