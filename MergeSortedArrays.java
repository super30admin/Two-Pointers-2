
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Two pointer and start from the end to merge the aarays
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int first = m - 1;
      int second = n - 1;
      int index = m + n - 1;

      for (int i = index; i >= 0; i--) {
        if (second < 0) {
          break;
        }

        if (first >= 0 && nums1[first] > nums2[second]) {
          nums1[i] = nums1[first];
          first--;
        } else {
          nums1[i] = nums2[second];
          second--;
        }
      }  
    }
}