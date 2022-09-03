//TimeComplexity O(m+n)
//Spacecomplexity O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl = matrix.length;
        int cl = matrix[0].length;
        int r = 0;
        int c = cl-1;
        while(r < rl && c >= 0){
            if(matrix[r][c] == target){
            return true;
        }else if(matrix[r][c] < target){
            r++;
        }else{
            c--;
        }
        }
        
        return false;
    }
}
