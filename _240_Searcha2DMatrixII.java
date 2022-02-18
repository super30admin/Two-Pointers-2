// space complexity - o(1)
  //time - o(n+m)
  //Ran on leeetcode successfully : Yes
  // Problem faced  : No
  //Approach : start at the left bootom or top right because one side will be smaller than the other, based on the cell value
  // target , decide weather move down the diagonal or go left the diagonal

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i = 0 ;
        int j = matrix[0].length-1;

        while(i< matrix.length && j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
}
