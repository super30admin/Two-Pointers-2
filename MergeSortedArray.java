// TC: O(n)
// SC: O(1)
// Approach: Iterate through primary array from backwards , Use two pointers p1 and p2 for both arrays, Compare max between p1 and p2
// replace current index element with max(p1,p2) decrement pointer.
// Keep a check p1 and p2 out of bounds 

public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int p1 = m - 1;
    int p2 = n - 1;

    for (int i = nums1.length - 1; i >= 0; i--) {
      if (p2 >= 0 && p1 >= 0) {
        if (nums1[p1] >= nums2[p2]) {
          nums1[i] = nums1[p1];
          p1--;
        } else if (nums2[p2] > nums1[p1]) {
          nums1[i] = nums2[p2];
          p2--;
        }
      } else if (p2 >= 0) {
        nums1[i] = nums2[p2];
        p2--;
      }
    }
  }

  public static void main(String[] args) {
    MergeSortedArray msa = new MergeSortedArray();
    int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
    int m = 3;
    int[] nums2 = new int[] { 2, 5, 6 };
    int n = 3;

    msa.merge(nums1, m, nums2, n);
  }
}