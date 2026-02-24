//We merge from the end using three pointers.
//
//Why from end?
//Because nums1 already has extra space at the end.
//
//Pointers:
//p1 → last element of nums1
//p2 → last element of nums2
//idx → last position of merged array
//Place the larger element at the end.
//
//Time: O(m + n)
//Space: O(1)

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for last valid element in nums1
        int p1 = m - 1;

        // Pointer for last element in nums2
        int p2 = n - 1;

        // Pointer for last position in nums1 (merged array)
        int idx = m + n - 1;

        // Merge until one array finishes
        while(p1 >= 0 && p2 >= 0) {

            // If nums2 element is larger
            if(nums2[p2] > nums1[p1]) {

                // Place nums2 element at end
                nums1[idx] = nums2[p2];

                // Move nums2 pointer left
                p2--;
            }
            // If nums1 element is larger or equal
            else {

                // Place nums1 element at end
                nums1[idx] = nums1[p1];

                // Move nums1 pointer left
                p1--;
            }

            // Move merged pointer left
            idx--;
        }

        // If nums2 still has elements left
        // Copy them
        while(p2 >= 0) {

            nums1[idx] = nums2[p2];

            p2--;

            idx--;
        }
        // No need to copy nums1 elements
        // because they are already in correct position
    }
}