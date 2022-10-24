//TC: O(n)
//SC: O(1)



class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int ptr1 = m-1, ptr2 = n-1, ptr3 = m+n - 1;

    while(ptr2 >= 0 && ptr1 >= 0 ) {


      if(nums1[ptr1] > nums2[ptr2]) {
        nums1[ptr3] = nums1[ptr1];
        ptr1--;
      }
      else {
        nums1[ptr3] = nums2[ptr2];
        ptr2--;
      }
      ptr3--;
    }


    while(ptr2 >= 0) {
      nums1[ptr3] = nums2[ptr2];
      ptr3--;
      ptr2--;
    }

  }
}