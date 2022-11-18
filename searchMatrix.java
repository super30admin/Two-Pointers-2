// Time Complexity : O(n+m)
// Space Complexity :O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length-1;
        int m=matrix[0].length-1;
        int r=0, c= m;
        int k = matrix[r][c];
        while(r<=n && c>=0){
            k=matrix[r][c];
            if(k == target){
                return true;
            }else if(k>target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}