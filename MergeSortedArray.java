// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Have 3 pointers, at m, n and end of the longer array. Compare the value at m with value at n, if [m] > [n] then add value at m to end of array , else add value of n to the end of array. Decrement the respective pointers to compare the previous values.

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if((nums1 == null && nums2 == null) || (nums1.length == 0 && nums2.length == 0 ) ) return;
        
        int ptr1 = m-1;
        int ptr2 = n-1;
        
        int end = m+n-1;
        
        while(end >= 0 && ptr2 >= 0){
            if(ptr1 >= 0 && nums1[ptr1] >= nums2[ptr2]){
                nums1[end] = nums1[ptr1];
                end = end - 1;
                ptr1 = ptr1 - 1; 
            } else {
                nums1[end] = nums2[ptr2];
                end = end - 1;
                ptr2 = ptr2 - 1; 
            }  
        }
    }
}
