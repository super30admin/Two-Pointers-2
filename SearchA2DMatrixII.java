/*

Thought Process - Take the Rightmost element as the initial number. So, all the numbers below it are greater and to the left are smaller.
So if target is greater than the number go down else go left. If the number is not present, eventually either the row or col with go out of bounds. If found return true.

TC -> O(m+n) where m = row and n = col size
SC -> O(1)

Mistakes Commited? -> Took some time to understand the right approach. Once figured on WB, easily coded without mistakes on LC.

*/

class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = 0;
        int n = matrix[0].length-1;
        
        while(m<=matrix.length-1 && n>=0){
            if(target == matrix[m][n]) {
                return true;
            }
            int a = matrix[m][n];
            if(target < matrix[m][n])
                n--;
            else m++;
        }
        return false;
    }
}