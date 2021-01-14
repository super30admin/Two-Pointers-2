
// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//We start at the top right corner of the matrix. If the current number is bigger than target we will move left in
//the matrix since the matrix is sorted. If it is smaller than we move down to find bigger numbers. We do this
//until we find or target or find that it is not in the array.


public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i = 0;
        int j = matrix[0].length - 1;

        while(matrix[i][j] != target){
            //if num bigger than target
            if(matrix[i][j] > target){

                if(j-1 < 0){
                    return false;
                }
                //move left
                j--;

            }
            else{
                //move down
                if(i + 1 > matrix.length - 1){
                    return false;
                }
                i++;

            }
        }
        return true;
    }
}