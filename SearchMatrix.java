
// Time Complexity : O(n*log(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Binary Search over columns and over rows

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null || matrix.length==0)
            return false;
        
        int shortArr = Math.min(matrix.length, matrix[0].length);
        for(int i=0; i<shortArr; i++){
            boolean rows = binarySearch(matrix, target, i, true);  
            boolean colums = binarySearch(matrix, target, i, false); 
            if(rows || colums){
                return true;
            }
        }
        return false; 
    }
    
    private boolean binarySearch(int[][] mat, int target, int i, boolean isRow){
        int left = i;
        int right = isRow ? mat[0].length-1 : mat.length-1;
        
        while(left <= right){
           int mid = left + (right - left)/2;
            if(isRow){
                if(mat[i][mid] < target){
                    left = mid + 1;
                }else if (mat[i][mid] > target) {
                    right = mid -1;
                }else{
                    return true;
                }
            }else{
                 if(mat[mid][i] < target){
                    left = mid + 1;
                }else if (mat[mid][i] > target) {
                    right = mid -1;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}