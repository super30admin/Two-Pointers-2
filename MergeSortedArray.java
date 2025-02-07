//Using comparisons to rearrange values in the first array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1[0] = nums2[0];
        }

        int i = m-1;
        int j = n-1;
        int idx = m+n-1;
        while(i >= 0 && j >= 0){
          if(nums1[i] > nums2[j]){
            nums1[idx] = nums1[i];
            i--;
          }else{
            nums1[idx] = nums2[j];
            j--;
          }
          idx--;
        }
     while (j >= 0) {
            nums1[idx] = nums2[j];
            idx--;
            j--;
        }
    }
}