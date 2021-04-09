
// Time Complexity : O(N+M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
/*
Since the rows and columns are individually sorted.
We can take the top right element as pivot and based of whether it is  > or < than the target we can discard the corresponding column and row respectively.
If it is = then we have found the element.
*/
// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null){
            return false;
        }
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
            
        }
        return false;
        
    }
}
