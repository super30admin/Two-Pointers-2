// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Maintain 3 pointers pointing to end of nums1 values, end of nums1 array and nums2 end.
// We start comparing nums1 and nums2 from end and start filling in the max value at end of nums1.
class MergeSortedArraysSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums1.length==0) {
            return;
        }
        int p1 = m-1, p2=n-1, p = m+n-1;
        while(p1>=0 && p2>=0) {
            if(nums1[p1] < nums2[p2]) {
                nums1[p--] = nums2[p2--];
            } else {
                nums1[p--] = nums1[p1--];
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, p2+1);       
    }
}