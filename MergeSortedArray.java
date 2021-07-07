/**
 * Idea is to use 2 pointers, each tracks in the beginning the last elements in the given array.
 * The process is similar to what we do in merge sort when we merge the two sorted arrays, just backwards.
 * 
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 * 
 * Leetcode Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Merge Sorted Array.
 */

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1, second = n - 1;
        if(m==0) { // first array is empty
            for(int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        // similar to merging of 2 sorted arrays, just reverse
        while(first >= 0 && second >= 0) {
            if(nums1[first] > nums2[second]) {
                nums1[first+second+1] = nums1[first];
                first--;
            } else {
                nums1[first+second+1] = nums2[second];
                second--;
            }
        }
        // if there are elements left in the second array to copy
        while(second >= 0) {
            nums1[first+second+1] = nums2[second];
            second--;
        }
    }
}