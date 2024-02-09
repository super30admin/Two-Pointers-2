//time complexity - O(m+n), space - O(1)
//The algorithm performs a search in a 2D matrix matrix for the target value. 
//It starts from the top-right corner and moves left or down based on the comparison of the current element with the target. 
//If the current element is equal to the target, the algorithm returns true. 
//If the current element is greater than the target, it moves left; otherwise, it moves down. 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0, j=n-1;
        //top right
        while(i<m && j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;
        
    }
}