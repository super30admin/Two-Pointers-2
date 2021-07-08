class Solution {
    //time-O(N+M)
    //space- O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //null check
        if(matrix.length==0) return false;
        
        int r=0, row=matrix.length-1, c= matrix[0].length-1;
        
        while(r<=row && c>=0){
            if(matrix[r][c]==target) return true;
            
            else if(matrix[r][c]> target) c--;
            
            else r++;
        }
        return false;
        
    }
}