public class SearchTwoDMatrix {
  /**
   * // Time Complexity : O(m+n)
   * // Space Complexity : O(1)
   * // Did this code successfully run on Leetcode : Yes
   *
   */
  public static boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0)
      return false;
    int m = matrix.length, n = matrix[0].length;
    int ptr1 = 0, ptr2 = matrix[0].length - 1;
    for (int i = 0; i < m + n - 1; i++) {
      if (ptr1 <= m - 1 && ptr2 >= 0 && matrix[ptr1][ptr2] == target)
        return true;
      if (ptr1 <= m - 1 && ptr2 >= 0 && matrix[ptr1][ptr2] < target) {
        ptr1++;
      } else if (ptr2 >= 0) {
        ptr2--;
      }
    }
    if (matrix[matrix.length - 1][0] == target)
      return true;
    return false;
  }

  public static void main(String args[]) {
    int[][] nums1 = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
        { 18, 21, 23, 26, 30 } };
    int target1 = 5, target2 = 20;

    int m = 3, n = 3;
    System.out.println(SearchTwoDMatrix.searchMatrix(nums1, target1));

    int[] nums3 = { 1 }, nums4 = {};
    int m1 = 1, n1 = 0;
    System.out.println(SearchTwoDMatrix.searchMatrix(nums1, target2));

  }
}
