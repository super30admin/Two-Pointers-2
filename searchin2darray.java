//time : O(m+n)
// space : O(1)
// passed all testcase
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0; 
        int j=n-1;
        // taking top right
        //System.out.print(i+""+j);
        // to avoid index out of bound
        while(i<m && j>=0)
        {
            if(matrix[i][j]==target) return true;
            if(matrix[i][j]<target)
            {
                i++; // if target is greater we move one row ahead as numbers are ascending
            }
            else{ 
                j--; // if target is small we have to go left
            }
        }
        return false; // target not found
    }
}