
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No

//Approach  Since the matrix rows and columns are sorted in ascending order
// start the search from top-right or bottom-left to search optimally and check.  If the target == top-right then return
// ture.  If target is less than top-right element then it cannot be in that column reduce the column by 1 and if
//the target is greater than the top-right then it cannot be in that row increase the row with 1.
public class Search2DMatrix2 {

    public static boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length < 1 || matrix[0].length < 1  ) return false;
        int row = 0;
        int colSize = matrix[0].length-1;
        int matrixSize = matrix.length-1;
        while(colSize >=0 && row <= matrixSize){
            if(target == matrix[row][colSize]){
                return true;
            }else if(target < matrix[row][colSize] ){
                colSize--;
            }else if(target > matrix[row][colSize]){
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] nums = {{-5}};
        int target = -5;
        System.out.println(searchMatrix(nums, -5));
    }
}
