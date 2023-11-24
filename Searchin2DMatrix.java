// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class Searchin2DMatrix {
    // brute force
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length;j++){
                if(matrix[i][j]==target)
                    ans = true;
            }
        }
        return ans;
    }
}
