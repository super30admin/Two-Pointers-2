// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[index--] = nums1[i--];
            }else{
                nums1[index--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[index--] = nums2[j--];
        }
    }
}