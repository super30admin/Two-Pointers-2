// Time Complexity : O(n + m) : worst case is length of nums1 and nums2
// Space Complexity : O(1) : start from end of nums1
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1; // read
        int ptr2 = n - 1; // read
        int ptr3 = nums1.length - 1; // write
        
        while (ptr3 >= 0){
            if (ptr1 >= 0 && ptr2 >= 0){
                if (nums2[ptr2] >= nums1[ptr1]){
                    nums1[ptr3] = nums2[ptr2];
                    ptr2--;
                }
                else{
                    nums1[ptr3] = nums1[ptr1];
                    ptr1--;
                }
            }
            else if (ptr1 < 0 && ptr2 >= 0){
                nums1[ptr3] = nums2[ptr2];
                ptr2--;
            }
            else if (ptr1 >= 0 && ptr2 < 0){
                nums1[ptr3] = nums1[ptr1];
                ptr1--;
            }
            else{
                break;
            }
            ptr3--;

        } 
        
    }
}