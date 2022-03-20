public class SearchIn2DMatrix {
  /**
   * Time Complexity: O( m + n)
   * Space Complexity: O(1)
   * 
   * Were you able to solve this on leetcode? Yes
   * 
   */
  public boolean searchMatrix(int[][] matrix, int target) {
    int row = 0, col = matrix[0].length-1;
    
    while(row < matrix.length && col >= 0){
        if(matrix[row][col] == target){
            return true;
        }
        
        if(matrix[row][col] > target){
            col--;
        } else {
            row++;
        }
    }
    
    return false;
}
}
