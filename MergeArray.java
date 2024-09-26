// Time Complexity : n^2(logn)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    System.arraycopy(nums2, 0, nums1, m, n);
    Arrays.sort(nums1);
}
}
//----------------3 pointer solution as shown in class-----------------
// Time Complexity : O(n)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
  
        int i = (m + n) - 1;
        int j  = m - 1;
        int k = n - 1;
        
        while(j >= 0 && k >= 0){
            if(nums2[k]>nums1[j]){
                nums1[i] = nums2[k];
                i--;
                k--;
            }
            else{
                nums1[i] = nums1[j];
                j--;
                i--;
            }
        }
        
        while(k >= 0){
            nums1[i] = nums2[k];
            k--;
            i--;
        }
}
}