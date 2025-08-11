class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start with upper right corner , r = 0 , c last
        // if target == r0cn-1 return true
        // else if target < it means that col can be skip  c--
        // else r++

        int m = matrix.length; //total rows
        int n = matrix[0].length; // total columns

        int r = 0;
        int c = n-1;



        boolean res = false;

        while( r < m && c >= 0 ){

            int i = matrix[r][c];

            if( target == i ){
                res = true;
                return res;
            }
            else if( target < i ){ // skip column
                c--;
            }
            else{
                r++;
            }
        }
        return res;


    }
}