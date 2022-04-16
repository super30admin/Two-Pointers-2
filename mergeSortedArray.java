
// Time Complexity :  o( m + n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// i make use of 3 pointers to keep track of positions
// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null) {
            return;
        }
        int r1 = m - 1;
        int r2 = n - 1;
        int r3 = m + n - 1;
        while(r1 >= 0 && r2 >= 0) {
            if(nums1[r1] > nums2[r2]) {
                nums1[r3] = nums1[r1];
                r3--;
                r1--;
            }
            else {
                nums1[r3] = nums2[r2];
                r3--;
                r2--;
            }
        }
        while(r2 >= 0) { // this case needs to be handled since there may still be elements in nums2 array left
            // we use r3 pointer to place since it records the place accurately in nums1
            nums1[r3] = nums2[r2];
            r3--;
            r2--;
        }
    }
}