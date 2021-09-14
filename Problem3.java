
// Time Complexity : o(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// logis is to start from either of the diagonal and increment and row and column values depending upon the target
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i= 0;
        //first row last column 
        int j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target) return true;
            //if that diagonal first element is greater than target then it is in same row but before column so move j 
            if(matrix[i][j] > target){
                j--;
            }
            // if current elemnt is less than target then move the row to next cause we may find it in next row if not in current row
            else{
                i++;
            }
        }
        return false;
    }
}