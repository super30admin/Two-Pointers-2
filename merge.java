//Time Complexity: O(m + n) -You traverse all elements of nums1 and nums2 once from the back. 
//Space Complexity: O(1) - Merging is done in-place without using extra space.

//Start from the end of both arrays (nums1 and nums2) and merge the largest values at the back of nums1.
//If nums2 has remaining elements, copy them to the front of nums1.
//No need to copy nums1's remaining elements as they are already in place.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;          
        int index2 = n - 1;           
        int mergeIndex = m + n - 1;   

        while (index1 >= 0 && index2 >= 0) {
            if (nums2[index2] > nums1[index1]) {
                nums1[mergeIndex] = nums2[index2];
                index2--;
            } else {
                nums1[mergeIndex] = nums1[index1];
                index1--;
            }
            mergeIndex--;
        }

        // If any elements left in nums2
        while (index2 >= 0) {
            nums1[mergeIndex] = nums2[index2];
            index2--;
            mergeIndex--;
        }
    }
}
