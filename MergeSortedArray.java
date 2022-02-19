// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: I take three pointers, i = marks the values in nums1 from end, j = marks the 
// values in nums2 from end and k = marks the values of sorted array from the end.
// I check for the kth position, which has greater value and mark it at kth position.
// I keep doing this u ntil one of the initial arrays become empty and copy the remaining
// ones correctly.

// LC- 88. Merge Sorted Array

public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (m == 0 && n == 0) {
      return;
    } else if (m == 0) {
      int i = 0;
      while (i < n) {
        nums1[i] = nums2[i];
        i++;
      }
      return;
    } else if (n == 0) {
      return;
    }

    int i = m - 1, j = n - 1, k = m + n - 1;
    while (k >= 0) {
      if (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
          nums1[k] = nums1[i];
          k--;
          i--;
        } else {
          nums1[k] = nums2[j];
          k--;
          j--;
        }
      } else if (j >= 0) {
        while (j >= 0 && k >= 0) {
          nums1[k] = nums2[j];
          k--;
          j--;
        }
      } else {
        return;
      }
    }
  }
}
