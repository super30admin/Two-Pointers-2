// TC: O(m+n)
// SC: O(1)
// Approach: Start from top right or bottom left compare that cell with target if its equal return true else if target is greater that means you have to 
// increament row because all the below elements are greater (increment row) if target is smaller decrement column and keep doing this until you find a target
// else return false if you have explored all cells
// Notice that you cannot start from top-left or bottom-right because both its neighbours are larger and at this point we don't know where to make the next move.

public class SearchATwoDMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {

    int m = matrix.length;
    int n = matrix[0].length;
    int r = 0;
    int c = n - 1;

    while (r < m && c >= 0) {
      if (matrix[r][c] == target) {
        return true;
      } else if (matrix[r][c] > target) {
        c--;
      } else if (matrix[r][c] < target) {
        r++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    SearchATwoDMatrix stm = new SearchATwoDMatrix();
    int[][] matrix = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
        { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
    int target = 5;

    System.out.println(stm.searchMatrix(matrix, target));
  }
}
