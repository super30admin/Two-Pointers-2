//Time Complexity: O(m+n)
//Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //null case check
        if(matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        ///setting the row and col such that it points the top right corner
        int row = 0; int col = n - 1;
        //[1 4 7[P]]
        //[2 5 8]
        //[3 6 9]
        
        //looping until we reach the last row and first column
        //[1 4 7]
        //[2 5 8]
        //[3[P] 6 9]
        while(row < m && col >= 0)
        {
            
            //[1 4 7[P]]
            //[2 5 8]
            //[3 6 9] and target == 7
            if(matrix[row][col] == target) return true;
            
            //target == 2 and
            //[1 4 7[P]]  --> [1 4[P] 7]
            //[2 5 8]     --> [2 5 8]
            //[3 6 9]     --> [3 6 9]
            if(matrix[row][col] > target)
            {
                col--;
            }
            
            //target == 9 and
            //[1 4 7[P]]  --> [1 4 7]
            //[2 5 8]     --> [2 5 8[P]]
            //[3 6 9]     --> [3 6 9]
            else
            {
                row++;
            }
        }
        //if we are not able to find the element after looping, return false
        return false;
    }
}