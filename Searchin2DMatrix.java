// Time Complexity : O(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class Searchin2DMatrix {
    // brute force
    public boolean searchMatrix(int[][] matrix, int target) {
        // Time Complexity : O(m*n)
        // Space Complexity : O(1)
        boolean ans = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length;j++){
                if(matrix[i][j]==target)
                    ans = true;
            }
        }
        return ans;
    }
    public boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix==null) return false;
        int  m =matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1; // taking top right we can start with bottom left as well.
        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
