// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : maintain two pointers at the end of eah array. Find the greater one and copy it to the end of merged array
/// (here nums1), repeat until we reach start of both arrays
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m+n-1;
        int i=m-1, j=n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[idx--] = nums1[i];
                i--;
            }
            else{
                nums1[idx--] = nums2[j];
                j--;
            }
        }
        while(i>=0){
            nums1[idx--] = nums1[i--];
        }
        while(j>=0){
            nums1[idx--] = nums2[j--];
        }
        return;
    }
}