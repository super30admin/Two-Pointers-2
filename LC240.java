// TC: O(m+n)
// SC: O(1)

class LC240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if(target<matrix[0][0] || target>matrix[m-1][n-1]){
            return false;
        }

        int i=0;
        int j=n-1;

        while(i>=0 && i<m && j>=0 && j<n){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else {
                i++;
            }
        }

        return false;
    }
}