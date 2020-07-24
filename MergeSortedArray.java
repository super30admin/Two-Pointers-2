// Time Complexity : O(N+M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// We observe that we have to merge two arrays and the larger values of two array should go at the end of array(nums1)
// where we are going to copy the values of smaller array. So, we need three pointers, two to compare the elements in
// two arrays and one pointer(end of nums1) that keeps track of values that are sorted in the array. We compare the values at
// pointers in nums1 and nums 2, which ever value is larger we swap it with third pointer and then reduce both the pointers.

// Your code here along with comments explaining your approach
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 == 0) {
            nums1 = nums2;
            return;
        }
        if (len2 == 0) {
            return;
        }
        int boundary = len1 - 1;
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        while (pointer1 >= 0 && pointer2 >= 0) {
            if (nums2[pointer2] >= nums1[pointer1]) {
                swap(nums1, nums2, boundary, pointer2);
                pointer2--;
                boundary--;
            } else {
                swap(nums1, nums1, boundary, pointer1);
                pointer1--;
                boundary--;
            }
        }
        while (pointer2 >= 0) {
            nums1[boundary--] = nums2[pointer2--];
        }
    }

    private void swap(int[] nums1, int[] nums2, int x, int y) {
        int temp = nums2[y];
        nums2[y] = nums1[x];
        nums1[x] = temp;
    }
}
