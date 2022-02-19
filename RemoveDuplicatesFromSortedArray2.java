// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: Take two pointers, i points to the current element and j points to the next element.
// Check if previous element and ith element are equal, if they are, increment count, else 
// initiliaze count for that element (i.e. make it 1). If count <= 2, we overwrite jth element
// with ith element and increment j.

// LC- 80. Remove Duplicates from Sorted Array II

public class RemoveDuplicatesFromSortedArray2 {
  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    if (nums.length == 1) {
      return 1;
    }

    int j = 1, count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        count++;
      } else {
        count = 1;
      }

      if (count <= 2) {
        nums[j++] = nums[i];
      }
    }

    return j;
  }
}
