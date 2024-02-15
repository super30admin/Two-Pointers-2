
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/**
 * Approach 1: Start adding the elements from nums2 from m+1 position in nums1 and sort. TC = O((m+n)log(m+n))
 * Approach 2: Take 3 pointers. p1(in nums1) at (m-1)th index and p2(in nums2) at (n-1)th index will be used to
 * compare the elements and 3rd pointer idx(in nums1) at (m+n-1)th index will fill nums1 from behind.
 */


public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;

        while(p1>=0 && p2>=0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }

        while(p2>=0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}
