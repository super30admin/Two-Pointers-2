/**
 * Search2DMatrix : Search2DMatrix
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 11, 2024)
 * @since : 1.0 (Nov 11, 2024)
 */
public class Search2DMatrix {
 public boolean searchMatrix(int[][] matrix, int target) {
  int r = matrix.length-1, c = 0;
  while(r >= 0 && c < matrix[0].length){
   if(target < matrix[r][c]){
    r--;
   }else if(target > matrix[r][c]){
    c++;
   }else{
    return true;
   }
  }

  return false;
 }
}
