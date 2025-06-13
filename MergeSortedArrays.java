// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Approach - started from the end of both the arrays to check the greater element and start pushing the greater element
// at the end of th first array with the help of three pointers kept at the end of nums1, at the index of last element of
//nums1 and nums2

import java.util.Arrays;
public class MergeSortedArrays {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m+n-1;
        int mL = m - 1;
        int nL = n - 1;

        while(mL >= 0 && nL >= 0) {
            if(nums2[nL] > nums1[mL]) {
                nums1[end] = nums2[nL];
                nL--;
            } else {
                nums1[end] = nums1[mL];
                mL--;
            }
            end--;
        }

        while(nL >= 0) {
            nums1[end] = nums2[nL];
            nL--;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        System.out.println(Arrays.toString(nums1) + "    " + Arrays.toString(nums2));
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
