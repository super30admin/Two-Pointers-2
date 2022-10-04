// Time Complexity : O(m+n) m is number of elements in nums1 and n is number of elements in array nums2.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {nums1[n-1] = nums2[n-1];}
        int p3 = m+n-1;
        int p2 = n-1;
        int p1 = m-1;

        while(p1>=0 && p2>=0) {
            if(nums1[p1] >= nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            }else{
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }

        while(p2>=0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}