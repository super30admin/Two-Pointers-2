
//T(N)=O(M+N)
//S(N)=O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0; //Take 2 pointers
        int j=n-1;
        while(i>=0&&i<m&&j>=0&&j<n)
        {
            if(matrix[i][j]==target)  // 
                return true;
            else if(matrix[i][j]>target) //if ele >target then all elements in that column is greater than k , so decrease column
                j--;
            else
                i++;		// if ele< target then all elements in that column is less than k , so increment row
        }
        return false;		//If ele not found above return false
        
    }
}