//https://leetcode.com/problems/merge-sorted-array/
/*
Time: O(m+n) where m=nums1.length and n=nums2.length
Space: O(m)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];

            else
                nums1[k--] = nums2[j--];
        }

        while (j >= 0)
            nums1[k--] = nums2[j--];

    }

}
