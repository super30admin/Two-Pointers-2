// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        int i= m+n-1;
        while(ptr1 >= 0 && ptr2 >= 0){
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[i] = nums1[ptr1];
                ptr1--;
                i--;
            }else{
                nums1[i] = nums2[ptr2];
                ptr2--;
                i--;
            }
        }
        while(ptr2 >= 0){
            nums1[i] = nums2[ptr2];
            ptr2--;
            i--;
        }
    }
}