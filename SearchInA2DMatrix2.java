// Time Complexity : 0(mxn)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//I have used two pointer approach but start with top right corner. then compare the value and move accordingly.
// if value is > than target then  decrement j col (j--) and if less than increment i row (i++)
public class SearchInA2DMatrix2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length; //col
        int m = matrix.length; // row
        int i = 0;
        int j = n-1;
        if(m==0 || matrix== null) return false;

        while(i<=m-1 && j>=0){
            if(matrix[i][j] == target){ return true;}

            else if(matrix[i][j] > target){
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}
