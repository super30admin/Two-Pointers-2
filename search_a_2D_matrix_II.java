//Time complexity : O(m+n) or O(max(m,n))
//Space complexity : O(1)
//Here we have two options to start: One from Top right or another from bottom left
//If we start from top right : If target is smaller than the top right elemennt then go left(column--) otherwise if target is greater than the top right element then go down(row++). follow the same procedure until you find the target
// Vice versa to start from bottom left also.


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int r = 0;
        int c = n-1;
        
        while(r<m && c>=0)
        {
            if(target > matrix[r][c])
            {
                r++;
            }
            else if(target < matrix[r][c])
            {
                c--;
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}