/*
Two Pointers
Time Complexity : O(m + n) where m is the length of nums1 and n is the length of nums2
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Intuition: We can use a two-pointer approach starting from the end of both arrays. 
This way, we can fill nums1 from the back without overwriting any elements that we still need to compare.
*/

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--; // since array starts at 0, we need to access the last index

        int index = nums1.length - 1;

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) // since we are going from behind (right to left)
                nums1[index--] = nums1[m--]; // M : don't FORGET de-crements
            else
                nums1[index--] = nums2[n--];
        }

        // This code portion is very important as it contains the foll test case
        /**
         * nums1 = 4 5 6 0 0 0
         * m
         * nums2 = 1 2 3
         * 
         * nums1 = 4 5 6 4 5 6
         * ^
         * m
         * nums2 = 1 2 3
         * n
         * 
         * since n >= 0 we need to copy over all elements from n2 arr to n1 arr
         * 
         */
        while (n >= 0) {
            nums1[index--] = nums2[n--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        msa.merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
