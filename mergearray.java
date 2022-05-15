

// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length;
        while(m-1>=0 && n-1>=0){
            if(nums1[m-1] >= nums2[n-1] ){
                nums1[l-1] = nums1[m-1];
                l--;
                m--;
            }else{
                nums1[l-1] = nums2[n-1];
                l--;
                n--;
            }
            
        }
        while(n-1>=0){
            nums1[l-1]=nums2[n-1];
            n--;
            l--;
        }
    }
}