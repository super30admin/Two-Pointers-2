/**** Method 1 ****/
//Time Complexity: O((m+n)log(m+n))
//Space Complexity: O(n)

//Successfully when submitted in LeetCode

//Copy all the elements from arr2 to arr1 end and then sort the arr1, to get a completely sorted arr of both arr1 and arr2.

/**** Method 2 ****/
//Time Complexity: O(m+n)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

// Two pointers, take two pointer starting from end of both array and now take another third pointer which points to end of arr1 i.e m + n - 1, now populate the third pointer with largest value of i and j pointer and decrement, so on continue till j >=0.

import java.util.Arrays;

public class TW2_88_Merge_Sorted_Array {

  /**** Method 1 ****/
  public void merge1(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = 0;

    while (j < n) {
      nums1[i + 1] = nums2[j];
      i++;
      j++;
    }
    Arrays.sort(nums1);
  }

  /**** Method 2 ****/
  public void merge2(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;

    int k = m + n - 1;

    while (j >= 0) {
      if (i >= 0 && nums1[i] > nums2[j]) {
        nums1[k] = nums1[i];
        i--;
      } else {
        nums1[k] = nums2[j];
        j--;
      }
      k--;
    }
  }
}
