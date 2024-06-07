/*
    LC - 88. Merge Sorted Array
    TC - O(n)
    SC - O(1)
    Approach - Using three pointers, keep the p1 at the m, p2 at n and p3 at the  m+n. check the maximum of p1, p2 and assign to p3, move the respective max value pointer and p3.
    if p2 is still remaining, then swap it with p3 and move the pointer till it reach the limit.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0) {
            return;
        }
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while(p1 >= 0 && p2>=0) {
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