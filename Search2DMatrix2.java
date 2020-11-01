package S30.TwoPointers_2;

/*
Time Complexity : Put: O(m + n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class Search2DMatrix2 {

    public boolean searchMatrix(int[][] matrix, int target) {

        //clever Divide and Conquer algorithm. Start from bottom left or top right as you can divide search space into higher and lower
        int R = matrix.length;
        if(R == 0) return false;
        int C = matrix[0].length;

        int i = R-1;
        int j = 0;

        while(i >=0 && j < C){

            if(matrix[i][j] == target) return true;

            //go lower -- up is low, right is high
            if(matrix[i][j] > target) {
                i--;
            }else j++;
        }
        return false;
    }
}
