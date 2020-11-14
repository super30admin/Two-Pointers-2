// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Starting from the bottom left, to find the target by moving the pointer to left if the current element os lesser
//than the target or else to right

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = rows-1;
        int j = 0;

        while(j<cols && i>=0){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] > target){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}
