class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int r = row-1;
        int c = 0;
        while(r>=0 && c<col){
            int m = matrix[r][c];
            if(target==m){
                return true;
            }else if(target<m) {
                --r;
            }else{
                ++c;
            }
        }
        return false;
    }
}
//tc=O(m+n)
//sc=O(1)
