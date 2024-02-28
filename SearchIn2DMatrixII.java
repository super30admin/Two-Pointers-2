
// Time Complexity : O(log(n!))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int shorterDim = Math.min(matrix.length,matrix[0].length);
        for(int i=0; i<shorterDim; i++){
            boolean vertical = binarysearch(matrix,target,i,true);
            boolean horizontal = binarysearch(matrix, target, i, false);

            if( vertical || horizontal ){
                return true;
            }
        }
        return false;
    }

    private boolean binarysearch(int[][] matrix, int target, int start, boolean vertical){
        int lo = start;
        int hi = vertical? matrix[0].length-1 : matrix.length -1;

        while(hi>=lo){
            int mid = (lo +hi)/2;

            if(vertical){
                if(matrix[start][mid] < target){
                    lo = mid +1;
                } else if(matrix[start][mid] > target){
                    hi = mid -1;
                } else {
                    return true;
                }
            }
            else {
                 if(matrix[mid][start] < target){
                    lo = mid +1;
                } else if(matrix[mid][start] > target){
                    hi = mid -1;
                } else {
                    return true;
                }
            }   
        }
        return false;
    }
}