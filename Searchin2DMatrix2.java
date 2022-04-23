// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class Searchin2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0 || matrix == null){
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }

        return false;
    }
}
