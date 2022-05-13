
// Time Complexity :O(m+n) where m is length of arr1 and n is length of arr2
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes

//we will start two pointers , ptr1 at m-1 and ptr2 at n-1. we'll start i pointer drom end of arr1 
//and will place larger element at i and dec pointer having larger value. if arr1 ends before arr2, we'll copy all arr2 elements in arr1 using i

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (ptr1 >= 0 && ptr2 >= 0) {
                if (nums1[ptr1] >= nums2[ptr2]) {
                    nums1[i] = nums1[ptr1];
                    ptr1--;
                } else {
                    nums1[i] = nums2[ptr2];
                    ptr2--;
                }
            }
        }
        if (ptr2 >= 0) {
            while (ptr2 >= 0) {
                nums1[ptr2] = nums2[ptr2];
                ptr2--;
            }
        }

    }
}