
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // copy the elements of nums2 into the end of nums1
        for (int i = 0; i < n; i++) {
        nums1[m + i] = nums2[i];
        }
    
        // sort the entire nums1 array
        Arrays.sort(nums1);
    }
}


//Two pointer approach

//Time = O(m+n)
//Space = O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1; // pointer to the last element in nums1
        int ptr2 = n - 1; // pointer to the last element in nums2
        int mergePtr = m + n - 1; // pointer to the last position in the merged array
        
        while (ptr1 >= 0 && ptr2 >= 0) { // while there are elements in both arrays
            if (nums1[ptr1] > nums2[ptr2]) { // if the current element in nums1 is greater than the current element in nums2
                nums1[mergePtr] = nums1[ptr1]; // put the current element of nums1 at the end of the merged array
                ptr1--; // move the pointer of nums1 one position to the left
            } else {
                nums1[mergePtr] = nums2[ptr2]; // put the current element of nums2 at the end of the merged array
                ptr2--; // move the pointer of nums2 one position to the left
            }
            mergePtr--; // move the pointer of the merged array one position to the left
        }
        
        while (ptr2 >= 0) { // if there are still elements in nums2
            nums1[mergePtr] = nums2[ptr2]; // put the remaining elements of nums2 in the merged array
            ptr2--;
            mergePtr--;
        }
    }
}
