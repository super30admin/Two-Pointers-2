// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; //pointer to first array
        int p2 = n-1; //pounter to second array
        int idx = m+n-1; //pointer to insert element at the correct position
        while(p2 >= 0 && p1 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[idx] = nums1[p1];
                idx--;
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                idx--;
                p2--;
            }
        }
        while(p2 >= 0) {
            nums1[idx] = nums2[p2];
            idx--;
            p2--;
        }
    }
}