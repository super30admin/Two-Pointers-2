// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        for(int i=nums1.length-1 ; i>=0 ; i--) {
            if(ptr1 >=0 && ptr2 >=0) {
                if(nums2[ptr2] >= nums1[ptr1]) {
                    nums1[i] = nums2[ptr2];
                    ptr2--;
                } else {
                    nums1[i] = nums1[ptr1];
                    ptr1--;
                }
            }
            else if(ptr1 < 0 && ptr2 >= 0) {
                nums1[i]=nums2[ptr2];
                ptr2--;
            }
        }

    }
}