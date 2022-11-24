/**
 * TC - O(m * n)
 * SC - O(1)
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length -1 ;

        // start with row = 0 & column = matrix[0].length
        int rowIndex = 0, colIndex =  matrix[0].length - 1;
        while(rowIndex <= row && colIndex >= 0) {

            if(matrix[rowIndex][colIndex] == target) {
                return true;
            } else if (matrix[rowIndex][colIndex] > target) { // if target is samller than cell go left
                colIndex--;
            } else {  // if target is greater than cell go down
                rowIndex++;
            }
        }
        return false;

    }
}
