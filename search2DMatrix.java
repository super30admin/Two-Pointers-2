// Time Complexity :O(m+n) where m rows and n columns
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//searching from right most corner.
//if element is greater than current, then go down
// if element is less than current, then go left

// Your code here along with comments explaining your approach
public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length ==0) return false;
    
    int row=0; //starting from right end
    int c = matrix[0].length-1;
    
    while(row< matrix.length && c >=0){
        if(matrix[row][c] < target){
            row++;
        }else if(matrix[row][c] > target){
            c--;
        }else{
            return true;
        }
    }
    return false;
}