// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class RemoveDuplicates2 {
  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int count = 1;
    int index = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        count++;
      } else {
        count = 1;
      }

      if (count <= 2) {
        nums[index] = nums[i];
        index++;
      }
    }

    return index;
  }
}
