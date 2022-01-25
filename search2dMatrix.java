//Time Complexity: O(m + n)  -- m rows and n columns
//Space Complexity: O(1)
//For this problem, we can start searching fro the target element from the top right or the bottom left. This is because we can 
//compare the target element and see if it is greater or less than the element that we are at. Accordingly, we can move our pointer 
//and hence eliminating a row or a columnn each time we move it.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; int n = matrix[0].length;
        
        int i = 0; int j = n-1;
        
        while(i<m && j>=0){
            int ele = matrix[i][j];
            
            if(ele == target){
                return true;
            }else if(target<ele){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}