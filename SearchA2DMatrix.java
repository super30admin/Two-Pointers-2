//time - O(m + n)
//space - constant

//brute force - binary search in each row gives time nlogn
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
        {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        //start from the top right corner
        //if target is less than current, it cant be in the last column, so decrement column
        //if target is above current, it cant be in the first row, so increpent row
        
        int row = 0;
        int column = n - 1;
        
        while(row < m && column >= 0)
        {
            int current = matrix[row][column];
            if(current == target)
            {
                return true;
            }
            else if(current < target)
            {
                row++;
            }
            else
            {
                column--;    
            }
        }
        return false;
    }
}
