// Time Complexity : O(m+n) , m : no. of rows, n : no. of col
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes



//Choose top right element
//if its == target return true
//if target is less, elimanate the col, do col --
// if target is larger, eliminate the row, row++
// row values are decreasing order from element, so right most element(top right) will be largest 
// col values are increasing order from element, so top most element(top right) will be smallest 
// Looks like Binary Search Tree, from top right
// if we place matrix[row][col] == target in else part efficiency is better as this is most likely to execute.

//Alternate : Choose bottom left element
//and repeat
//here col values are getting smaller 
//and row values are getting larger
//if target is > than element, col ++
//if target is < than element, row--

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        if(matrix[0].length == 0) return false;
        
        int row = 0;
        int col = matrix[0].length-1; 
        
        while(row < matrix.length && col >= 0) {
            
            if(matrix[row][col] == target) return true;
            
            else if(target < matrix[row][col]) col--;
            
            else row++;
            
        } return false;        
    }
}


