// Time complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/*
       Traverse the first array from last index and compare the last element of first element with
       last element of another array. If the last element of first array is smaller than last element of second array
       then add the last element of the second array to the last index of first array.
 */
public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {

    // Index of nums1 array
    int i = m - 1;
    //Index of nums2 array
    int j = n - 1;
    //Length of nums1 array
    int k = m + n - 1;

    while (k >= 0) {

      if (i >= 0 && j >= 0) {
        //Check if the last element of first array is greater than last element of second array and
        // place the elements accordingly in first array.
        if (nums1[i] >= nums2[j]) {
          nums1[k--] = nums1[i--];
        } else {
          nums1[k--] = nums2[j--];
        }
      } else if (j >= 0) {
        nums1[k--] = nums2[j--];

      } else {
        break;
      }

    }
    for (int value : nums1) {
      System.out.println(value);
    }
  }

  public static void main(String[] args) {

    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};
    int m = 3;
    int n=3;
    MergeSortedArray msa = new MergeSortedArray();
    msa.merge(nums1, m, nums2, n);
  }

}