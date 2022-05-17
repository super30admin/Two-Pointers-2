// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Decrement m, n and l because of indexing from 0
        int l=m+n-1;
        m--;
        n--;
        //use the same nums1 array to form the result since they have already given extra space for the resultant in nums1 no need to create a new array space
        while(m>=0 && n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[l]=nums1[m];
                l--;
                m--;
            }
            else{
                nums1[l]=nums2[n];
                l--;
                n--;
            }
        }
        while(n>=0){
            nums1[l]=nums2[n];
            l--;
            n--;
        }
    }
}
