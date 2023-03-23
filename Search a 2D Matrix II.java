class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Time: O(n + m)
        //Space: O(1)
        int row = matrix.length - 1;
        int col = 0;

        while(row >= 0 && col < matrix[0].length){

            if(matrix[row][col] > target){
                row --;
            }

            else if(matrix[row][col] == target){
                return true;
            }

            else{
                col++;
            }



        }

        return false;
    }
}