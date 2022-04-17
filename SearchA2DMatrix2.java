// Time Complexity : O(m+n), where m is the number of rows and n is the number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//We will start either from the lower left or upper right. we chos ethese 2 corners because it helps two deterministically decide in which direction we can move. In case of lower left, if the number we are searching is greater then we will look in the the same row and next column while if the number is smaller then we will look in the upper row or row-1.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0)
            return false;
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        //lower left diagonal
        int i = m;
        int j = 0;
        while(i>=0 && j<=n){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target)
                j++;
            else
                i--;
        }
        return false;
    }
}
