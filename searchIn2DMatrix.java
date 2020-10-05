
    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
    Time Complexity for operators : o(logn) .. n is the length of the array
    Extra Space Complexity for operators : o(1) .. no extra space
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : two for loops n2.
        # Optimized approach: 
                              
            # 1. 
                    A) Try to search vertically first. Binarry search of vertical rows.
                    B) Try to serach horizontally on columns.
                    C) Return true if any of them comes true
                    D) else return false.
    */ 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null)
            return false;
        
        // Apply binary search on row and columns vertically and horzontally and try to find the element
        int shorter = Math.min(matrix.length,matrix[0].length);
        for(int i=0;i<shorter;i++){
            boolean vertical = binarySearchVertically(matrix,target,i);
            boolean horizontal = binarySearchHorizontally(matrix,target,i);
            if(vertical || horizontal)
                return true;
        }
        
        return false;
    }
    
    public boolean binarySearchVertically(int[][] matrix, int target, int i){
        int low = i;
        int high = matrix[0].length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(matrix[i][mid] == target){
                return true;
            }else if(matrix[i][mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return false;
    }

        
    public boolean binarySearchHorizontally(int[][] matrix, int target, int i){
        int low = i;
        int high = matrix.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(matrix[mid][i] == target){
                return true;
            }else if(matrix[mid][i] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return false;
    }
}