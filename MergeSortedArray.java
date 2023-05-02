// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * We use Two pointers approach: 3 pointer starting from end of the 3 arrays: nums1, nums2 and m + n. We keep on comparing:
 * pointers at end on nums1 and nums2 and place it in end of (m+n) as it would be the right place due to ascending order of the array. 
 * and move pointer whichever was placed. We do this until we have valid elements in both nums1 and nums2.
 * There could be a case where nums2 will still have element and we need to just append those. 
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null && nums2 == null) {
            return;
        }
        // i is a pointer in nums1 at the end of m 
        // j is a pointer in nums2 at the end of n
        // k is a pointer in nums1 at the end of m + n
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        //while both i and j are in bound we should compare and replace
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        //when nums2 array still has element
        while(j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
        return;
    }
}
