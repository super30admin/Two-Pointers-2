
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: since the rows and columns are completely sorted if the number is greater than the target reduce the column by 1 and move towards left or if the number is less then we increase the row by 1

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int i=0;
        int j=  n-1;
        while(i < m && j >= 0){
            if(matrix[i][j] == target){ return true;}
            else if(matrix[i][j] > target){
             j--;
            }else{
                i++;
            }
        }
        return false;
        
    }
}