
// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

//Here we start the search from the top right corner where we know one side is decreasing and one side is increasing and we check with the target
//and accordingly move our pointer and locate the element.




class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length; 
        int n = matrix[0].length;
        int r = 0;
        int c = n - 1;
        while(r < m && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target) {
                c--;
            }else{
                r++;
            }
        }return false;
        
    }
}