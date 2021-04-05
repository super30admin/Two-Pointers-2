// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // base condition
        if(nums1 == null || nums1.length == 0) {
            return;
        }
        // base condition
        if(nums2 == null || nums2.length == 0) {
            return;
        }
        int p1 = m-1;
        int p2 = n - 1;
        int index = m + n - 1;
        while(p1>=0 && p2>=0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[index--] = nums1[p1--];
            }
            else {
                nums1[index--] = nums2[p2--];
            }
        }
        // this while loop will see if p1 is out of bounds then put all the p2
        while(p2 >=0) {
            nums1[index--] = nums2[p2--];
        }
        // we don't need a while loop for p1 because if p2 is out of bounds meaning the p1 will remain where it is
    }
}
