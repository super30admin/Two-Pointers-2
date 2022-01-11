//Time Complexity: O(m+n)
//Space Complexity: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0)
            return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if(target==matrix[i][j])
                return true;
            else if(target<matrix[i][j])
                j--;
            else 
                i++;
        }
        return false;
    }
}
