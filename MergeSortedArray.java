// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Use three pointers one at the end of nums1 with values, end of nums2 and end of nums1. Start filling nums1 from the 
// end check if value pointing to nums1 is gretaer than nums2 and then fill end of nums1 with the higher value. If all the 
// elements in either of the array is over then just fill the nums1 using the array left with elements. 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(k>=0){
            if(i>=0 && j>=0 && nums1[i]>=nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else if(i>=0 && j>=0 && nums1[i]<nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            else if(i<0){
                nums1[k]=nums2[j];
                j--;
                k--;
            }
            else{
                nums1[k]=nums1[i];
                i--;
                k--;
            }
        }
        
    }
}