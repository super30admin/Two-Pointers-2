// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Use 3 pointers to keep track of nums1 last element nums 2 last element and nums1 valid last element
// start by comparing larger elenmentrs solve by filling the valid last elements until nums2 is traversed
// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // use 3 pointer

        int p1 = n + m - 1;     // 1st Pointer : End of nums1
        int p2 = m - 1;         // 2nd pointer : End of nums1 array size : m
        int p3 = n - 1;         // 3rd pointer : End of nums2 array size : n
        while ( p2 >= 0 && p3 >= 0 ) {
            if ( nums1[p2] > nums2[p3] ) { 
                nums1[p1] = nums1[p2];
                p2--;
            }
            else {
                nums1[p1] = nums2[p3];
                p3--;
            }
            p1--;
        }
        while ( p3 >= 0 ) {         // If P3 is not empty it means all elements of P3 should be inserted to P1
            nums1[p1] = nums2[p3];
            p3--;
            p1--;
        }
    }
}