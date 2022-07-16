// Time Complexity: O(M + N), M = length of nums1, N =  length of nums2
// Space Complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0)
            return;
        
        int ptr1 = m-1, ptr2 = n-1, curr = m+n-1;
        while(ptr1 >= 0 && ptr2 >= 0) {
            if(nums1[ptr1] > nums2[ptr2]) {
                nums1[curr] = nums1[ptr1];
                curr--;
                ptr1--;
            }
            else {
                nums1[curr] = nums2[ptr2];
                curr--;
                ptr2--;
            }    
        }
        while(ptr2 >= 0) {
            nums1[curr] = nums2[ptr2];
            curr--;
            ptr2--;
        }
    }
}
