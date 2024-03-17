// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// This code merges two sorted arrays `nums1` and `nums2` into `nums1` in-place.

// It employs pointers `p1` and `p2` at the end of each array and `idx` at the end of the merged `nums1`.

// By iterating through the arrays, it compares elements pointed by `p1` and `p2`, placing the larger one at `idx` while decrementing respective pointers, and appends remaining elements from `nums2` if any.

public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;

        while(p1 >=0 && p2 >=0)
        {
            if(nums1[p1] > nums2[p2])
            {
                nums1[idx] = nums1[p1];
                p1--;
            }
            else
            {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while(p2 >=0)
        {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
        
    }
}