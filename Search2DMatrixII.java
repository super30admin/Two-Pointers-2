//Leetcode - 240
//Time Complexity - O(M+N)
//Space Complexity - O(1)
public class Search2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0, j=n-1;
        while(i<m && j>=0) {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;

    }
}
