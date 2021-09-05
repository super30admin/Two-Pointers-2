// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // intialize pointers
        int pt1 = m - 1;
        int pt2 = n - 1;
        int i = m + n - 1;

        // interate reverse through both arrays
        // insert the maximum element from both arrays at the last position of the first array
        while(pt1 >=0 && pt2 >= 0){
            if(nums1[pt1] > nums2[pt2]){ // compare elements
                nums1[i] = nums1[pt1];  // insert maximum
                pt1--; // decrement the pointer
            } else {
                nums1[i] = nums2[pt2]; // insert maximum
                pt2--; // decrement the pointer
            }
            i--; // decrement the pointer to the last element in array 1
        }
        // copy the remaining elements from 2nd array to 1st array
        while(pt2 >= 0){
            nums1[i] = nums2[pt2];
            pt2--;
            i--;
        }
    }
}