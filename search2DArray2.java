
// Time Complexity : o(logN!)

// loop run for min(m,n) times. for each iteration i am performing 2 binary search for m-i and n-i length
// which is o(logN) + o(logN-1) + ....+ o(log1) = o(logN!)


// Space Complexity : i am not using extra space so : o(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach






class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0)
            return false;
        
        int dim = Math.min(matrix.length,matrix[0].length);
        for(int i=0; i<dim; i++){
            
            boolean vartical = search(matrix, target, i, true);
            boolean horizontal = search(matrix, target, i, false);
            if(vertical || horizontal){
                return true;
            }
            
        }
        
       return false; 
        
    }
    
    public boolean search(int[][] matrix, int target, int start, boolean vertical){
        int lo = start;
        int hi = vertical ? matrix[0].length-1 :  matrix.length-1;
        
        while(lo <= hi){
            
            int mid = (lo + hi)/2;
            if(vertical) { // searching column
                if(matrix[start][mid] < target){
                    lo = mid + 1;
                }else if(matrix[start][mid] > target){
                    hi = mid - 1;
                }else{
                    return true;
                }
            }else{
                if(matrix[mid][start] < target){
                    lo = mid+1;
                }else if(matrix[mid][start] > target){
                    hi = mid - 1;
                }else{
                    return true;
                }
            }
            
        }
       return false; 
    }
    
    
}