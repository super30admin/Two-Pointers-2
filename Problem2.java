/* Problem 2- Merge sorted array */

// Time Complexity : O(m+n) since m and n are lengths of two arrays
// Space Complexity : O(1) since we are not using extra space
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach
// Here we will consider two pointers: ptr1 and ptr2 where ptr1 is set to length of nums1
// and ptr2 is set to length of nums2 array
// ptr is used at length m+n-1 i.e. at the last index of new sorted array
// Case 1 and 2) we will compare values at ptr1 and ptr2, if anyone is greater, we will replace the last index(m+n-1) with greater value
// keep decrementing the index in array for each ptr1 and ptr2
// Lastly, even if the pointer is not reached out of bound in nums2 array, keep copying and replace the values directly since both are sorted arrays

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //initialise two pointers ptr1 and ptr2 for each nums1 and nums2 array with the last index
        int ptr1 = m-1;
        int ptr2 = n-1;
        //initialise ptr at m+n-1 length
        int ptr = m+n-1;
        // Checking if it doesn't go out of bound at each step of decrementing ptrs
        while(ptr1 >= 0 && ptr2 >=0){
            //Case 1) if nums1 ptr1 value is greater than nums2 ptr2 value, replace nums1 ptr value with nums1 ptr1 value
            if(nums1[ptr1] > nums2[ptr2]){
                //making sure to decrement ptr and ptr1 at the same time
                nums1[ptr--] = nums1[ptr1--];
            }
            //Case 2) if nums1 ptr1 value is lesser than nums2 ptr2 value, replace nums1 ptr value with nums2 ptr2 value
            else {
                //making sure to decrement ptr abd ptr2 at the same time
                nums1[ptr--] = nums2[ptr2--];
            }
        }
        // if nums 2 array elements are still left to compare, just copy and replace the values directly
        while(ptr2 >= 0){
            nums1[ptr--] = nums2[ptr2--];
        }
    }
}
