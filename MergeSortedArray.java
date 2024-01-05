/*
* Approach:
*  1. Apply pointers technique, 
        but if we are starting the pointers from start,
        we are not sure of right position of smaller elements in arr1.
    
        if smaller element in arr2 comes in, 
            we should move our element to right which increases time.
* 
        Therefore, we start from the last.
*  2. Maintain 3 pointers,
        action = place the elements at right place
        p1 = pointer traversing arr1 elements
        p2 = pointer traversing arr2 elements
* 
*  3. Move p1 and action, if p1 is greater
        move p2 and action, if p2 is greater.

    if p1 is exhausted, copy remaining elements of arr2 into arr1
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(m+n)
* 
* Space Complexity: O(1)
* 
*/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int action = nums1.length - 1, p2 = nums2.length - 1;

        int p1 = nums1.length - nums2.length - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[action] = nums2[p2];
                p2--;
            } else {
                nums1[action] = nums1[p1];
                p1--;
            }
            action--;
        }

        while (p2 >= 0) {
            nums1[action] = nums2[p2];
            action--;
            p2--;
        }
    }
}
