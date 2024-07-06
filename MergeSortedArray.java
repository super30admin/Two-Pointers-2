// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m-1;
    int p2 = n-1;
    int p3 = m+n-1;
    // Case 1 when elements are taken from both arrays.
    while(p1>=0 && p2>=0) {
      nums1[p3] = Math.max(nums1[p1], nums2[p2]);
      p3--;
      if(nums1[p1]>nums2[p2]) p1--;
      else p2--;
    }
    // Case 2 when elements from nums2 are remaining after p1 goes out of bounds.
    while(p1<0 && p2>=0) {
      nums1[p3] = nums2[p2];
      p3--;
      p2--;
    }
  }
}