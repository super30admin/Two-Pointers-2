// Time complexity - O(nlogn)
// Space complexity - O(1)

// Merge and sort

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
      for(int  i = m;i < (m+n); i++){
          nums1[i] = nums2[j++];
      }
      Arrays.sort(nums1);
       
    }
}
