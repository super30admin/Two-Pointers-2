// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode: Yes
// Did you face any issues running this code: No

// Your code here along with comments explaining your approach
class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0, col=matrix[0].length-1;

        //start from top right element and check the boundaries
        while(row<matrix.length && col>=0) {
            //if the target is greater, move down
            if(matrix[row][col] < target){
                row++;
            } //if the target is lesser, move left
            else if(matrix[row][col] > target) {
                col--;
            } //it the target is equal, return true
            else {
                return true;
            }
        }
        return false;
    }
}