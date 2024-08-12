// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class MergeTwoSortedArrays{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // This loop copies elements until either one of the array index is reached 0
        while(m>0 && n>0) {
            if(nums1[m-1] >= nums2[n-1] ) {
                nums1[m+n-1] = nums1[m-1];
                m--;
            } else {
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }

        // This is to copy left-over elements from num2 to nums1 if they are there
        for(int i=0;i<n;i++) {
            nums1[i] = nums2[i];
        }
    }
}