//Time Complexity – O(m+n)
//Space Complexity – O(1)
// Did this code successfully run on Leetcode :
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //checking for an empty array
        if(matrix == null || matrix.length == 0)
        return false;
        //declaring initials
        int m = matrix.length; //no of rows * columns
        int n = matrix[0].length; //no of columns
        int i = 0; 
        int j = n-1;
        
        while(i < m && j >= 0){
            if(matrix[i][j] == target)
            return true;
            //if element is in same column
            else if(matrix[i][j] > target){
                j--;
            //traversing to next row to find an element
            }else{
                i++;
            }
        }
        return false;
    }
}
