
// Time Complexity : O(mxn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// The algorithm uses three pointers: p1 is positioned at the end of the combined size of nums1 and nums2, p2 is at the end of nums2, and p3 is at the end of the actual elements in nums1. As the algorithm iterates, it compares the current elements at p3 and p2, placing the larger value into nums1 at the position indicated by p1, then decrements the pointers accordingly. This continues until all elements from nums2 have been merged into nums1.
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m+n-1;
        int p2=n-1;
        int p3=m-1;

        while(p3>=0 && p2>=0){
            if(nums2[p2]>=nums1[p3]){
                nums1[p1]=nums2[p2];
                p1--;
                p2--;
            }else if(nums1[p3]>nums2[p2]){
                nums1[p1]=nums1[p3];
                p3--;
                p1--;
            }
        }
    }
}