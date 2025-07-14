public class MergeSortedArray {
}
//O(m + n)
//O(1)
//Implemented using two pointer technique.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null) {
            return;
        }
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while(p1 >= 0 && p2 >= 0) {
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            p3--;
            if(nums1[p1] > nums2[p2]) {
                p1--;
            } else {
                p2--;
            }
        }
        while(p2 >= 0) {
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }

    }
}