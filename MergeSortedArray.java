// Time Complexity : O(nums1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Have 3 pointers. One at the m-1 position of the nums1 array, one at the nums1.length-1 position of the nums1 array and the third one at the n-1 position of the nums2 array. compare the nums1 element at pointer m-1 and nums2 element at pointer n-1. place the greater of the two elements at the nums1.length position and decrement the pointer with the greater element along with the nums1.length pointer. Take care of the edge condition where nums2 array is remaining while m is done.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int nums2_p = n-1;
        int nums1_p = nums1.length-1;
        int i = m-1;
        
        while(i >=0  && nums2_p >= 0){
          // [1,2,3,0,5,6]
          // [2,5,6]
          // 6 > 3 ? num1p = 6 : nums1p = 3;
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


