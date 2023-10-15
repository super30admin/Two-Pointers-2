// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class MergeTwoSortedArrays {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int nums1Len = nums1.length;

            int idx = nums1Len - 1, p1 = m - 1, p2 = n - 1;

            while(p1 >= 0 && p2 >= 0){
                if(nums1[p1] > nums2[p2]){
                    nums1[idx] = nums1[p1];
                    idx--;
                    p1--;
                }
                else{
                    nums1[idx] = nums2[p2];
                    idx--;
                    p2--;
                }
            }

            while(p2 >= 0){
                nums1[idx] = nums2[p2];
                idx--;
                p2--;
            }
        }
    }
}
