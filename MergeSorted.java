
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2 == null || nums2.length==0){
            return;
        }
        if(n==0){
            return;
        }
        int start = m-1;
        int second = n-1;
        int last = m+n-1;
        while(start >= 0 && second >=0){
            if(nums1[start]>nums2[second]){
                nums1[last--] = nums1[start--];
            }
            else {
                nums1[last--] = nums2[second--];
            }
        }
        while(second >= 0){
            nums1[last--] = nums2[second--];
        } 
    }
}