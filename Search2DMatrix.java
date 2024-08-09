//Time Complexity: O(m*n)
//Space Complexity: O(1)
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n-1;
        while(row>=0 && row<m && col>=0 && col<=n-1){
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]>target){
                col--;
            } else{
                row++;
            }
        }
        return false;

    }
}
