//Time Complexity - O(n) where n is the number of elements in the matrix
//Space Complexity - O(1)
// This solution worked on Leetcode
// This solution, the optimal way to traverse in the sorted row and column is to start at the first element last row. If the element is greater than the target then it means all the elements in that row will be greater than the target. Hence, we decrement the row(i--)
//If the element is smaller than the target than increment the column to check the next element in the row. 



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    //Edge Case
        if(matrix == null || matrix.length==0)
            return false;
        // Logic
        int i=matrix.length-1;
        int j=0;
        while(i>=0 && j<matrix[0].length){
            if(matrix[i][j]==target)       // Return true if element is found
                return true;
            if(matrix[i][j] > target){    
                i--;
            }
            else{
                j++;
            }
        }
        return false;               // return false if the program reaches to the end and still has not found the target
    }
}
