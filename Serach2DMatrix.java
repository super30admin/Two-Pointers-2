// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

//in such problem, we can choose right-top corner or bottom-left
//becasue rows and column both are sorted individually , so we can decide thst our target is smaller or grater than the corner position and we can make correct decision of going (up or down) in matrix or towards the sideways.

class Serach2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int rowIdx = 0;
        int colIdx = n-1;

        while((rowIdx < m) && (colIdx > -1)){
            if(matrix[rowIdx][colIdx] == target){
                return true;
            } else if(matrix[rowIdx][colIdx] > target){
                colIdx--;
            } else {
                rowIdx++;
            }
        }
        return false;
    }
}