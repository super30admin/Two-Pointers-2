
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Problem3 {
    //TC : O(N+M)
    // SC : O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r =  m-1;
        int c = 0;

        //we are strting from bottom left cell

        while(r>=0 && c <= n-1){
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] > target){
                r--;
            }else{
                c++;
            }
        }
        return false;

    }
}
