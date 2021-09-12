// Time Complexity : O(m+n) single iteration over all the elements from both arrays
// Space Complexity : O(1) no auxilary data structure used for processing
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //declaring and initializing the two pointers
        int ptr1 = m - 1; 
        int ptr2 = n-1;
        int i = m + n - 1; //going to use for interation from end (total size)
        
        while(ptr1 >= 0 && ptr2 >= 0) { //checking ptr position ahead of 0
            if( nums1[ptr1] > nums2[ptr2] ) { //comparing numbers from both arrays
                nums1[i] = nums1[ptr1]; //putting greater element at the i'th
                ptr1--; //moving back bye one
            }
            else {
                nums1[i] = nums2[ptr2]; //putting greater element at the i'th
                ptr2--; 
            }
            i--; //iterating back by one
        }
        
        while(ptr2 >= 0) { //if elements from nums1 finishes first
            nums1[i] = nums2[ptr2]; //putting remaining elements in merged array
            ptr2--; 
            i--;
        }
    }
}