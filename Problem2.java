// Time Complexity : O(m+n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
Start three pointers from the end: p1 at last real element of nums1, p2 at last of nums2, and p3 at the very end of nums1.
Compare nums1[p1] and nums2[p2], and put the larger one at nums1[p3], moving the corresponding pointer(s) left.
If anything remains in nums2, copy it into the front of nums1 (leftover elements in nums1 are already in correct position).
*/

public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = (m+n) - 1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums2[p2] > nums1[p1]) {
                nums1[p3] = nums2[p2];
                p2--;
            } else {
                nums1[p3] = nums1[p1];
                p1--;
            }

            p3--;
        }

        while(p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }

    }
}
