// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.Arrays;

class Main {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // l
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (p1 >= 0 && p2 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else if (p2 >= 0) {
                nums1[i] = nums2[p2];
                p2--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = new int[] { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}