class MergeSortedArray {
  /**
   * Time Complexity: O(m + n)
   * Space Complexity: O(1)
   * 
   * Were you able to solve this on leetcode? Yes
   * 
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
        
    int pointer1 = m - 1;
    int pointer2 = n - 1;
    int idx = nums1.length - 1;
    while(idx >= 0 && pointer1 >= 0 && pointer2 >= 0){
        if(nums1[pointer1] > nums2[pointer2]){
            nums1[idx] = nums1[pointer1];
            pointer1--;
        } else {
            nums1[idx] = nums2[pointer2];
            pointer2--; 
        }
        idx--;
    }
    
    // pointer2 could still be >= 0 and might not have transferred all elements
    while(pointer2 >= 0){
        nums1[idx] = nums2[pointer2];
        idx--;
        pointer2--;
    }
}
}
