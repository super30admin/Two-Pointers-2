//the approach here is to traverse the matrix only from either the top right or from the bottom left because those are the only two position where the eliminate the entire row or column depending on the condition
//Time Complexity: O(m+n)
//Space Complexity:O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m-1;
        int j = 0;
        while(i>=0 && j<n){
            if(matrix[i][j] == target){
                return true;
            } else if(matrix[i][j] > target){
                i--;
            } else{
                j++;
            }
        }
        return false;
    }
}
