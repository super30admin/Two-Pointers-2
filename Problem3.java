//Time = O(m*n)
//Space = O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    // iterate through every element in the matrix
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            // check if the current element is equal to the target value
            if (matrix[i][j] == target) {
                return true; // return true if target is found
            }
        }
    }
    return false; // return false if target is not found
    }
}


//Two Pointer approach (Binary search)

//Time = O(m+n)
//Space = O(1)

public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return false;
    }
    
    int row = 0;
    int col = matrix[0].length - 1;
    
    while(row < matrix.length && col >= 0) {
        if(matrix[row][col] == target) {
            return true;
        } else if(matrix[row][col] > target) {
            col--;
        } else {
            row++;
        }
    }
    
    return false;
}
