/*
88. Merge Sorted Array
Ran on leetcode: Yes
TC: O(m + n) SC: O(1)
Start at last index of nums1, nums2 and result, since that would avoid loss of values of nums1. Check if element in nums1 is greater than nums2 and place in result and vice versa. Fill rest of the element remaining in nums2 if necessary.
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m - 1, p2 = n - 1, r1 = m + n - 1; // Pointer on last index of nums1, nums2 and result array
    

        while(p1 >= 0 && p2 >= 0){ // Fill elements from end of result array, to not loose elements from nums1
            if(nums1[p1] > nums2[p2]){ // If the element on nums1 is greater than nums2 place nums1 element
                nums1[r1] = nums1[p1]; // Place on last unfilled index of result
                p1--;
            } else { // If the element on nums2 is greater than nums1 place nums1 element
                nums1[r1] = nums2[p2]; // Place on last unfilled index of result
                p2--;
            }
            r1--;
        }

        while(p2 >= 0){ // Fill rest of the elements of nums2, since nums1 is result the element in nums1 are already at right place
            nums1[r1] = nums2[p2];
            p2--;
            r1--;
        }
    }
}