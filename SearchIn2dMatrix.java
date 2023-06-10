public class SearchIn2dMatrix {

    // pointer base solution
    //time complexity: O(m+n) m = row n = col
    //Space complexity: Constant
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target < matrix[0][0] && target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }

        //established rule:
        //start from max row and 0 column
        //top -> means less;
        //right -> means more

        int row = matrix.length - 1;
        int col = 0;
        //int num = matrix[row][col];
        while(row >= 0 && col >= 0 && row <= matrix.length - 1 && col <= matrix[0].length - 1) {
            int num = matrix[row][col];
            if(num == target) {
                return true;
            }
            else if(num > target){
                row--;
            }
            else{
                col++;
            }

        }

        return false;

    }
}
