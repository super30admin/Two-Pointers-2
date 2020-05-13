//LeetCode : 240. Search a 2D Matrix II
//Time Complexity : O(n) // (row+col) of matrix 
//Space Complexity: O(1) // No extra space 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0){
            return false;
        }
        int i=0;
        int j=matrix[0].length-1;
        
        while(i<matrix.length && j>=0){
            if(matrix[i][j]== target){
                return true;
            }
            if(matrix[i][j]> target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}