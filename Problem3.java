
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
start checking from top left element in the matrix
if taget is equal to value of matrix[row][column] element, return true
if greater, increase row by 1
else, decrease column by 1 
time-O(m+n)
space-O(1)
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int m = matrix.length;
        int n =matrix[0].length;
        int c=matrix[0].length-1;
        while(r>=0 && r<m && c>=0 && c<n){
            if(target==matrix[r][c]){
                return true;
            }
            else if(target<matrix[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        return false;

    }
}