class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix==null)    return false;
        int m=matrix.length-1; int n=matrix[0].length-1;
        int i=0; int j=n;
        while(m>=i && j>=0 )
        {
            if(matrix[i][j]==target)    return true;
            else if(matrix[i][j]<target)    i++;
            else    j--;
        }
        return false;
    }
}
//time complexity T(n)=O(m+n)
//space: O(1)