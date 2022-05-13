import java.util.Arrays;

public class MergeSortedArray {
  // Time Complexity: O(N)
  // Space Complexity: O(1)
  public static int[] merge(int[] Array1, int m, int[] Array2, int n) {
    if (Array1 == null || Array1.length == 0) {
      return Array2;
    }
    int ptr = m + n - 1;
    m--;
    n--;
    while (m >= 0 && n >= 0 && ptr >= 0) {
      if (Array1[m] < Array2[n]) {
        Array1[ptr] = Array2[n];
        n--;
        ptr--;
      } else {
        Array1[ptr] = Array1[m];
        ptr--;
        m--;
      }
    }
    while (ptr >= 0 && n >= 0) {
      Array1[ptr] = Array2[n];
      ptr--;
      n--;
    }
    return Array1;
  }

  public static void main(String args[]) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
    int m = 3, n = 3;
    System.out.println(Arrays.toString(MergeSortedArray.merge(nums1, m, nums2, n)));

    int[] nums3 = { 1 }, nums4 = {};
    int m1 = 1, n1 = 0;
    System.out.println(Arrays.toString(MergeSortedArray.merge(nums3, m1, nums4, n1)));

    int[] nums5 = { 0 }, nums6 = { 1 };
    int m2 = 0, n2 = 1;
    System.out.println(Arrays.toString(MergeSortedArray.merge(nums5, m2, nums6, n2)));
  }
}
