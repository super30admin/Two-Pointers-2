
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * I set three pointers -  at p1 at m-1(end of first array), p2 at n-1 and i at m+n-1. Until either of p1 or p2 become less than zero,
 * if nums1[p1] is greater than or equal to nums2[p2], I set nums1[i] = nums1[p1]. Else I set nums1[i] = nums2[p2]. Now if p2 is 
 * greater than 0, I copy all elements of nums2 to nums1.
 */

 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;

        while(p1>=0 && p2 >=0)
        {
            if(nums1[p1]>=nums2[p2])
            {
                nums1[i]=nums1[p1];
                p1--;
            }
            else
            {
                nums1[i]=nums2[p2];
                p2--;
            }
            i--;
        }
        while(p2>=0)
        {
            nums1[i]=nums2[p2];
            p2--;
            i--;
        }
    }
}