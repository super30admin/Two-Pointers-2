// Time Complexity : O(m+n) where m = number of rows and n = number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // check if input matrix is null or empty
        if(matrix == null || matrix.length == 0) return false;
        
        // find number of rows and columns of input matrix
        int m = matrix.length;
        int n = matrix[0].length;
        
        // intialize cooridnates from the top right corner
        int i = 0;
        int j = n - 1;
        
        // traverse through the matrix
        while(i < m && j >=0){
            
            // if target is found then return true
            if(matrix[i][j] == target){
                return true;
            }
            
            // if target is less than current element go to left side i.e decrease column pointer
            else if(target < matrix[i][j]){
                j--;            
            }
            
            // else go down and increase the row pointer
            else{
                i++;
            }
        }
        
        
        // return fasle if target is not found in the matrix
        return false;
    }
}


// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
        
//         if(matrix == null || matrix.length == 0) return false;
        
//         // find number of rows and columns of input matrix
//         int m = matrix.length;
//         int n = matrix[0].length;
        
//         // intialize cooridnates from the bottom left corner
//         int i = m - 1;
//         int j = 0;
        
//         //traverse through the matrix
//         while(i >= 0 && j < n){
            
//             // if target is found then return true
//             if(matrix[i][j] == target) return true;
            
//             // if target is less than current element go upside i.e decrease row pointer
//             else if(target < matrix[i][j]){
//                     i--;
//             } 
            
//             // else go right and increase the column pointer
//             else{
//                     j++;
//                 }
//         }
        
//         // return fasle if target is not found in the matrix
//         return false;
//     }
// }


        