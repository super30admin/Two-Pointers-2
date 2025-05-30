//start from the end and check for the largest element. 
//once all elements from nums2 have been merged (i.e., j < 0), the job is done. nums1 is already in place
//Time complexity: O(m+n)^2
//Space complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(k>=0 && j>=0) {
            if(i>=0 && nums1[i]>=nums2[j]) {
                nums1[k]=nums1[i];
                i--;
            } else if(i>=0 && nums1[i]<nums2[j]) {
                nums1[k]=nums2[j];
                j--;
            } else if(j>=0) {
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
    }
}