// Time Complexity : O(n) n =  total length of nums1 array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Here we'll be maintaining three pointers
// One will be the last position on bigger array
// The other two will be on the last numbers on both the filled array
// By manipulating these three pointers we'll be able to get the desired result

// Your code here along with comments explaining your approach

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m-1, idx2 = n-1;
        for(int i = nums1.length-1; i>=0;i--) {
            if(idx1 >= 0 && idx2 >= 0) {
                if(nums2[idx2] > nums1[idx1]) {
                    nums1[i] = nums2[idx2];
                    idx2--;
                } else {
                    nums1[i] = nums1[idx1];
                    idx1--;
                }
            } else if(idx2 >= 0) {
                nums1[i] = nums2[idx2];
                idx2--;
            }
        }
    }
}