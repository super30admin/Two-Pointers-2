// Time complexity - O(m*n)
//Space complexity - O(1)
//Did you solve on leetcode - yes
//Did you face any problem - No
// Since the 2D matrix is sorted the last element will always be greater than all the elements it that row
// Hence we checking if the target is less than the last element in the row, we will move towards left else we will move down
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int j = m-1,i=0;
        while(j>=0 && i<n) {
            if(matrix[i][j] == target) return true;
            if(matrix[i][j]<target) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}
