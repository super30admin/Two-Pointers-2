// Merge sorted array
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// take two pointers P1 and P2. P1 should point to the last index of nums1(which is m-1) & P2 should point to the last index of nums2. Consider another variable index which is pointing to the last index (m+n lentgh).
// compare both the elements and which one is bigger place in the last index & move the index variable. P1 & P2 if needed
// Consider the scenario when nums1 finishes first & when nums2 finishes first



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //null

        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] >= nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
            }
            else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while(p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }

    }
}