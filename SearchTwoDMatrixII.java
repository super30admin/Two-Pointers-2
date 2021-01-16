
// Time Complexity :O(row + col)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// set loop to start from the first row and the right most element. check if the value is greater than the target value
// and if it is adjust column pointer by decremeting it else increase row pointer. If value is found return true, else
// return false.


// Your code here along with comments explaining your approach
public class SearchTwoDMatrixII {


    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix == null || matrix.length == 0) return false;

            int row = matrix.length, col = matrix[0].length;
            int curRow = 0, curCol = col-1;

            while(curRow < row && curCol >= 0){
                if(matrix[curRow][curCol] == target) return true;
                if(matrix[curRow][curCol] > target){
                    curCol--;
                } else {
                    curRow++;
                }
            }
            return false;
        }
    }


}
