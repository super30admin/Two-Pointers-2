/**

[1,4,7,11,15],
[2,5,8,12,19],
[3,6,9,16,22],
[10,13,14,17,24],
[18,21,23,26,30]]


32

[1,4,7,11,15]

low = 0;
high = cols - 1; 4


Implemented with Search space reduction:
Start from the top right corner and increment the rows if the target > current otherwise
decrement the col.
TC - O(n+m) in every search space reduction we are incrementing the rows or 
**/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int i = 0;
        int j = cols - 1;
            
        // base condition    
        while(i >=0 && i< rows && j>=0 && j < cols)
        {
            if (target > matrix[i][j])
            {
                i++;
            }
            else if (target < matrix[i][j])
            {
                j--;
            }
            else
            {
                return true;
            }
        }
        
        return false;
    }
}