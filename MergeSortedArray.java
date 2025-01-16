// Time Complexity: O(m+n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = m + n - 1;
    m = m - 1;
    n = n - 1;
    while (m >= 0 && n >= 0) {
      if (nums1[m] < nums2[n]) {
        nums1[index] = nums2[n];
        n--;
      } else {
        nums1[index] = nums1[m];
        m--;
      }
      index--;
    }
    while (n >= 0) {
      nums1[index--] = nums2[n--];
    }
  }
}
