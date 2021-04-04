//Approach - Two Pointers
// Start from the right end (highest element from both the arrays)
//Time Complexity - O(m+n)
//Space Complexity - O(1)

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    if(nums1 == null || nums1.length == 0){
      return;
    }

    int index1 = m-1;
    int index2 = n-1;
    int index = n+m-1;

    while(index1 >=0 && index2 >= 0){

      if(nums2[index2] > nums1[index1]){
        nums1[index] = nums2[index2];
        index2--;
      }else{
        nums1[index] = nums1[index1];
        index1--;
      }

      index--;
    }

    while(index2 >= 0){
      nums1[index] = nums2[index2];
      index2--;
      index--;

    }
  }
}