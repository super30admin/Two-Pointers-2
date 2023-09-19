// Time Complexity : O(m + n) as it will traverse either left or down until element is found
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem3 {
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
            }else if(target < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }

        return false;

    }
}
