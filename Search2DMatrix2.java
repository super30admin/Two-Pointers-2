// Time Complexity : O(m+n) the worst case scenario makes us visit all the elements in the matrix once
// Space Complexity : O(1) no auxilary data structure used for processing
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //null check
        if( matrix == null || matrix.length == 0 ) return false;
        
        int m = matrix.length; //height
        int n = matrix[0].length; //width
        int i = 0; //start point
        int j = n -1; //end point
        
        while( i < m && j >= 0 ) {
            if( matrix[i][j] == target ) return true; //checking if the target is at top right
            else if( matrix[i][j] < target ) { //if the target is greater it has to be searched in next row
                i++;
            }
            else { //otherwise it has to be searched in the same row but left
                j--;
            }
        }
        return false;//if not found at the end the loop, we return false
    }
}