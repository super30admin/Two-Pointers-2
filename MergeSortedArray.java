// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Use two pointers (end of nums2 and end of nums1(before the zeroes)) approach and
// start filling nums1 array from the back with the larger element from nums1 and nums2 

// Your code here along with comments explaining your approach

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }

        // only checking p2 because if p1 >= 0; elements are already in the right place
        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }
}