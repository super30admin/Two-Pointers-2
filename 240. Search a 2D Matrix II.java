class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int r = ROWS-1; int c = 0;

        while(r >= 0 && c < COLS){
            if(matrix[r][c] == target){
                return true;
            }

            else if(matrix[r][c] > target){
                r -= 1;
            }

            else{
                c += 1;
            }

        }
        return false;
        
    }
}

// T(C) :: O(M + N) Solution
// S(C) :: O(1)

// utilize the nature of our matrix
// start at the bottom of the matrix
// move our pointer towards row or column towards right based on target
