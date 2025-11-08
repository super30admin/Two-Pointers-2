/**** Method 1 ****/
//Time Complexity: O(n*m)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

//Use two for loops to traverse and search for element, if found return true else false.

/**** Method 2 ****/
//Time Complexity: O(nLogm)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

// Rather doing a linear search, we can use binary search as the all rows are sorted, so start traversing the matrix row wise and check if the target might be present in that row or not. If it might then do binarySearch on that row. If a target is found anywhere return true else false at the end.

/**** Method 2 ****/
//Time Complexity: O(Log(m+n))
//Space Complexity: O(1)

//Successfully submitted in LeetCode

// If we observe, all elements are sorted row and column-wise, so we start at right most corner of the matrix and check if it is the target, if not then if it less than target we can move in the column i.e i++, else if greater than target we can move row wise i.e  j--. If at any point i or j crosses it boundaries, then return false.

public class TW2_240_Search_a_2D_Matrix_II {

  /**** Method 1 ****/
  public boolean searchMatrix1(int[][] matrix, int target) {
    for (int[] arr : matrix) {
      for (int i : arr) {
        if (i == target) {
          return true;
        }
      }
    }
    return false;
  }

  /**** Method 2 ****/
  public boolean searchMatrix2(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;

    for (int i = 0; i < n; i++) {
      if (matrix[i][0] <= target && matrix[i][m - 1] >= target) {
        if (binarySearch(matrix[i], target)) {
          return true;
        }
      }
    }

    return false;
  }

  public boolean binarySearch(int arr[], int target) {
    int lo = 0;
    int hi = arr.length - 1;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if (arr[mid] == target) {
        return true;
      } else if (arr[mid] < target) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }

    return false;
  }

  /**** Method 3 ****/
  public boolean searchMatrix3(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;
    int i = 0;
    int j = m - 1;

    while (i < n && j >= 0) {
      if (matrix[i][j] == target) {
        return true;
      } else if (matrix[i][j] < target) {
        i++;
      } else {
        j--;
      }
    }

    return false;
  }
}
