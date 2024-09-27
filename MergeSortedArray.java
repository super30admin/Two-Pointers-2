// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// Use three pointers. Start with last element position in the bigger array
// Compare the elements at m and n locations respectively. Whichever is larger, add it to the end of an array. (ptr location of array. This is the third pointer)
// Keep doing so until ptr1 or ptr2 are -1
// If the elements are remaining in smaller array. Iterate over them and set it to the ptr location of larger array.

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int ptr1 = m-1;
        int ptr2 = n-1;
        int ptr = m+n-1;
        
        while (ptr1 >=0 && ptr2>=0) {
            if(nums1[ptr1] > nums2[ptr2]) {
                nums1[ptr] = nums1[ptr1];
                ptr--;
                ptr1--;
            }
            else {
                nums1[ptr] = nums2[ptr2];
                ptr--;
                ptr2--;
            }
        }
        
        while (ptr2 >=0) {
            nums1[ptr] = nums2[ptr2];
            ptr--;
            ptr2--;
        }
        
    }
}