/*
LC 88: Merge Sorted Array - https://leetcode.com/problems/merge-sorted-array/ - EASY
TC: O(m+n) => each element from both arrays is processed only once
SC: O(1)
Approach: 
- Use 2 pointers, for each array; compare element at both pointer and update in num1 array
- If we do this from the start, we risk overwriting elements in num1, 
and hence will have to shift elements to the right in num1.
- Start from the end and keep filling elements

*/

class MergeTwoArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1 ;
        
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }

        // no need to check for i here, because if num2 is exhausted, we know that elements in nums1 are already sorted
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }
}