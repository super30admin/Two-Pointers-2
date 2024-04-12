// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix[0].length;
        int m = matrix.length;
 
        int l = 0;
        int r = m*n-1;
 
        while (l <= r){
 
            int x = (l + r)/2;
            int mid = matrix[x/n][x%n];
 
            if (target == mid){
                return true;
            } else {
                if (target < mid){
                    r = x-1;
                }else {
                    l = x+1;
                }
            }
        }
        return false;
     }
}
