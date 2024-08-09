// Problem 88. Merge Sorted Array
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Merge {
    // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p1 = m-1;
            int p2 = n-1;
            int idx = m+n-1;
            while(p1 >= 0 && p2 >= 0){
                if(nums1[p1] >= nums2[p2]){
                    nums1[idx] = nums1[p1];
                    p1--;
                }else{
                    nums1[idx] = nums2[p2];
                    p2--;
                }
                idx--;
            }
            while(p2 >= 0){
                nums1[idx] = nums2[p2];
                p2--;
                idx--;
            }
        }
    }
}
