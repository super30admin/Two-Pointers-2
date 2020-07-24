/**
Problem: Merge two sorted arrays.
Time Complexity: O(m+n) where m is the size of the first array, and n is the size of the second array.
Space Complexity : O(1)
Did it run on Leetcode: Yes

Approach: 3 Pointers
1. Let the first pointer point to the end of the first array and the second pointer to the end of the second array.
2. We also make use of an indicator pointer, which points to the fact that elements after it are sorted.
3. At every point, we compare the two pointers, and place the maximum of those two in the indicator position and decrement the indicator pointer.
4. After doing this, if the first pointer runs out, we directly copy the elements present in the second array into the first array.
5. Thus, we have a merged and sorted array at the end.
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