
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class searchmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //base case to check if the array is empty
        if(matrix == null || matrix.length == 0)
            return false;
        
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        

        while(row < m && col >= 0){
            
            //when target is smaller than the element we move left into the row
            if(matrix[row][col] > target){
                col--;
            }
            //when target is greater we move down into the column
            else if(matrix[row][col] < target){
                row++;
            }
            //the element is the target
            else{
                return true;
            }
        }
        return false;
    }
}