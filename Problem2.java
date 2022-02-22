// Time Complexity : O(m+n) where m = length of nums1 array, n = length of nums2 array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;
public class Problem2 {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialise i and j pointers to the end of the 2 arrays
        int i = m-1, j = n-1;
        // Initialise current pointer to the end of nums1 array
        int curr = m+n-1;
        // While both i and j pointers are greater than or equal to 0
        while (i >= 0 && j >= 0) {
            // If nums1[i] is greater than nums2[j], set value of nums1 at current pointer to nums1[i]. Decrement the i pointer by 1
            if (nums1[i] > nums2[j]) {
                nums1[curr] = nums1[i--];
            } else { // If nums2[j] is greater than or equal to nums1[i], set value of nums1 at current pointer to nums2[j]. Decrement the j pointer by 1
                nums1[curr] = nums2[j--];
            }
            // Decrement current pointer by 1
            curr--;
        }
        // While i pointer is greater than or equal to 0
        while (i >= 0) {
            // set value of nums1 at current pointer to nums1[i]. Decrement both curr and i pointers by 1
            nums1[curr--] = nums1[i--];
        }
        // While j pointer is greater than or equal to 0
        while (j >= 0) {
            // set value of nums1 at current pointer to nums2[j]. Decrement both curr and j pointers by 1
            nums1[curr--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
