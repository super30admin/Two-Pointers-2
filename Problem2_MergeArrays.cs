// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : Using 3 pointers in this approach, 2 pointers to traverse through each arrays from m-1 and n-1 th positions to compare the numbers in the array
// and get the highest number to override the value at position starting the last index of the array nums1. By the end of comparisions and overriding of values
// we will have a sorted array.  

public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;
        while(p2 >= 0 ) {
            if(p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            }
            else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }
    }
}