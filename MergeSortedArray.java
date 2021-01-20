// Time Complexity : O(m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 2 pointer approach
//Fill up the larger array from end.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null || m+n == 0) return;

        int p1 = m -1;
        int p2 = n -1;

        int index = m+n -1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }
        while(p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }


    }
}
