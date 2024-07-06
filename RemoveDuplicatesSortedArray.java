// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
  public int removeDuplicates(int[] nums) {
    int j = 1;
    int count = 1;
    for(int i = 1; i<nums.length; i++) {
      // Counting the number of times an element is present.
      if(nums[i] == nums[i-1]) {
        count++;
      } else {
        count = 1;
      }
      // Swapping if the count is less than or equal to 2.
      if(count <= 2) {
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }
}