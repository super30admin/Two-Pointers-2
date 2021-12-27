
// Time Complexity :O(N+M)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

//Starting from first row and last column, we search for target element.If we don't get target in that case
//we will move down if target > number we check and left if target< number we check.
//we traverse till column >=0 || row <=matrix.length-1;

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int m = 0;
        int n = matrix[0].length-1;
        while(m <= matrix.length-1 && n >= 0){

            if(target < matrix[m][n])
            {
                n--;
            }
            else if(target > matrix[m][n])
            {
                m++;
            }
            else{
                return true;
            }

        }
        return false;
    }

}