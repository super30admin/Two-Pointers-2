
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //edge case
        if(n == 0) return;
        int ptr1 = m-1;
        int ptr2 = n-1;
        int idx = m + n - 1;
        while(ptr1 >= 0 && ptr2 >= 0) {
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[idx] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[idx] = nums2[ptr2];
                ptr2--;
            }
                idx--;
        }
        while(ptr2 >= 0){
            nums1[idx] = nums2[ptr2];
            ptr2--;
            idx--;
        }
        
    }
}