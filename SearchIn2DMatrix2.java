// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Idea here is to find a point from where you can make a clear move, like if the target number is smaller where to go
// and if the target number is greater where to go
// Here, we start from matrix[matrix.length -1][0] and we go up if we find target < current . if target > current, we go right. else we return

public class SearchIn2DMatrix2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int row = matrix.length - 1;
        int column = 0;

        while(row >= 0 && column < matrix[0].length){

            if(matrix[row][column] > target){
                row --;
            } else if(matrix[row][column] < target){
                column++;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean searchMatrixBruteForce(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }
}
