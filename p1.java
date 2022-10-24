//TC: O(n)
//SC: O(1)



class Solution {
  public int removeDuplicates(int[] nums) {
    int insert = 0;
    int iter = 0;
    int k =0;
    int n = nums.length;
    while(iter < n) {
      int ele = nums[iter], ctr = 0;
      while(iter < n && nums[iter] == ele) {
        ctr++;
        iter++;
      }
      if(ctr > 1) {
        nums[insert++] = ele;
        nums[insert++] = ele;
        k = k+2;
      }
      else {
        nums[insert++] = ele;
        k++;
      }
      //iter++;
    }
    return k;
  }
}