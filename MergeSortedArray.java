
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// 1. Two pointer approach by comparing elements from back of the array and placing them at the end

//88. Merge Sorted Array (Easy) - https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0|| nums2 == null || nums2.length == 0) return;
        
        int p1 = m-1, p2 = n-1, index = m+n-1;
        
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
                index--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
                index--;
            }
        }
        
        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }
}