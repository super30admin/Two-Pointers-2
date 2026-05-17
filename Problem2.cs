// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
I maintain three pointers a, b and c that point to the last element of internal sorted array within nums1, last element of nums2 and the last element of nums1 . I loop through the array
elements while a>=0 && b>=0. If nums2[b] < nums1[a] I place the element of nums1[a] at nums1[c] and decrement a by 1. Else I place the element at nums2[b] at nums1[c] and decrement b by 1.
If there are any remaining elements in nums2 array, I move them all to nums1 and return the final result.
*/

public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int c = m + n - 1, b = n - 1, a = m - 1;

        while(a>=0 && b>=0)
        {
            if(nums2[b] < nums1[a])
            {
                nums1[c] = nums1[a];
                a--;
            }

            else
            {
                nums1[c] = nums2[b];
                b--;
            }

            c--;
        }

        if(b>=0)
        {
            while(b>=0)
            {
                nums1[c] = nums2[b];
                b--;
                c--;
            }
        }
    }
}