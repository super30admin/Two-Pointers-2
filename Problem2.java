// Time Complexity : O(nums1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int nums2_p = n-1;
        int nums1_p = nums1.length-1;
        int i = m-1;
        
        while(i >=0  && nums2_p >= 0){

            if(nums1[i] < nums2[nums2_p]){
                nums1[nums1_p] = nums2[nums2_p];
                nums1_p--;
                nums2_p--;
            }
            else{
                nums1[nums1_p] = nums1[i];
                nums1_p--;
                i--;
            }
        }
      // nums1 is done and nums2 is remaining
        while(nums2_p >= 0){
            nums1[nums1_p] = nums2[nums2_p];
            nums1_p--;
            nums2_p--;
        }
    }
}
