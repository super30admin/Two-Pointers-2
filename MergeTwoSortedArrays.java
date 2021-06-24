/**
Problem: Merge two sorted arrays.

Time Complexity: O(m+n) 
Space Complexity : O(1)
Did it run on Leetcode: Yes

Approach: 3 Pointers


 */



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        int indicator = m + n - 1;
        while(ptr1>=0 && ptr2>=0) {
            if(nums1[ptr1] > nums2[ptr2]) {
                nums1[indicator] = nums1[ptr1];
                ptr1--;
            }
            else {
                nums1[indicator] = nums2[ptr2];
                ptr2--;
            }
            indicator--;
        }
        while(ptr2>=0) {
            nums1[indicator] = nums2[ptr2];
            ptr2--; 
            indicator--;
        }
    }
}
