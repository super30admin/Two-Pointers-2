// Problem 240. Search a 2D Matrix II
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = m-1;
        int c = 0;
        while(r >= 0 && c < n){
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] < target){
                c++;
            }else{
                r--;
            }
        }
        return false;
    }
}
