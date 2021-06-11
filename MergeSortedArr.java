// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : start from the last element index of the both the arr, compare the numbers of both array.
// Whichever is bigger put that in last index of the first arr, and move the pointer to left.
// Once any of the ptr reaches to start of the arr stop the traversal.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = nums1.length-1;
       int ptr1 = m-1;
       int ptr2 = n-1;
      //start two pointers from the end of the array 
        while(ptr1 >= 0 && ptr2 >= 0) {
          //put the bigger number at the last index of first arr and move the pointer to left
            if(nums1[ptr1] <= nums2[ptr2]) {
                nums1[i] = nums2[ptr2];
                ptr2--;
            } else {
                nums1[i] = nums1[ptr1];
                ptr1--;
            }
            i--;
        }
        //at the end of first arr, if second arr is not out fo bound copy remaining elements in the first arr
        while(ptr2 >=0) {
         nums1[i] = nums2[ptr2];
            ptr2--;  
            i--;
        }
    }
}