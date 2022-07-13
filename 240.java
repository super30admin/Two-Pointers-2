class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        if(matrix==null||matrix.length==0) return false;
        
        int m= matrix.length;
        int n= matrix[0].length;
            
            //top right[row:0, col:n-1]
        
        int r=0;
        int c=n-1;
        while(r<m&&c>=0)
        {
            if(matrix[r][c]<target)
            {
                r++;
            }
            else if(matrix[r][c]>target)
            {
                c--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}