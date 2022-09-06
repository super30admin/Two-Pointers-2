// TC:O(m+n)
// SC:O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m= matrix.length;
        int n=matrix[0].length;
        int j= n-1;
        int i=0;

        while(i< m && j>=0){
            if (matrix[i][j]==target) return true;
            else if (matrix[i][j]>target) j--;
            else i++;
        }
        return false;

    }
}