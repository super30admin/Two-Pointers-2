
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * Maintain 3 pointers. One to keep track of nums1 elements, one to keep track of nums2 elements and one to keep track of the merge arrays elements. 
 * If nums2 element is greater than nums1 element, place nums2 element at i of the merged array and decrement i and p2. 
 * Else decrement i and p1, and place nums1 element at i. 
 * If nums1 elements get over sooner, place nums2's elements at i, until the array is filled. 
 */

public class Problem2 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p1 = m-1;
            int p2 = n-1;
            int i = m+n-1;
            while(p1 >= 0 && p2 >= 0){
                if(nums1[p1] > nums2[p2]){
                    nums1[i] = nums1[p1];
                    p1--;
                }
                else {
                    nums1[i] = nums2[p2];
                    p2--;
                }
                i--;
            }
            while(p2 >= 0){
                nums1[i] = nums2[p2];
                p2--;
                i--;
            }
        }
    }
