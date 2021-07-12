//TC: O(N)
//SC: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || n == 0 || nums2 == null) {
            return;
        }
        
        int ptr1 = m-1, ptr2 = n-1, curr = m+n-1;
        
        while(ptr1 >=0 && ptr2 >= 0) {
            //check which is greater
            if(nums1[ptr1] > nums2[ptr2]) {
                nums1[curr] = nums1[ptr1];
                //cur--;
                ptr1--;
            }else {
                nums1[curr] = nums2[ptr2];
                ptr2--;
            }
            curr--;
        }
        
        while(ptr2>=0) {
            nums1[curr] = nums2[ptr2];
            curr--;
            ptr2--;
        }
    }
}