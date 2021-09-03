// Time Complexity : O(N+M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
/*
    While in bounds, keep reducing the matrix by outer bounderies.
    Eventually, the corner value will be the target value, if it lies in the matrix.
    At each corner, we can make a definite decision whether to dec. cols or inc. rows.
*/

public class search2DMat{
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int cols = matrix[row].length-1;
        
        while(row < matrix.length && cols >= 0){      
            int corner = matrix[row][cols];    
            if(corner == target) return true;
            else if(corner>target){
                cols--;
            }
            else
                row++;
        }
        return false;
    }

}