
// Time Complexity : O(m + n)
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class MergeSortedArray {

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1 == null || nums1.length == 0) {
            return;
        }

        int i = m - 1;
        int j = n - 1;
        int idx = nums1.length - 1;

        while( idx >= 0) {

            if(j < 0) {
                return;
            }

            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[idx] = nums1[i];
                idx--;
                i--;
            } else {
                nums1[idx] = nums2[j];
                idx--;
                j--;
            }
        }
    }
}
