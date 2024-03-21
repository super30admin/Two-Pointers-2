// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//      Start with 2 pointers at the end of nums1 and nums2. The greater of the 2
//      elements goes at the last index in nums1 and reduce the respective pointers
//      until one array is exhausted. Copy the remaining elements from the other array

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }
        while (p1 >= 0) {
            nums1[index] = nums1[p1];
            index--;
            p1--;
        }
        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            index--;
            p2--;
        }

    }
}