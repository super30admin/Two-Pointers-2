// Time complexity 0(m+n)
// space complexity 0(n)
// Code sucessfully executed on leetcode
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //edge case
        if(n==0) return;
        int ptr1 = m-1;
        int ptr2 = n-1;
        int id = m+n-1;
        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[id] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[id] = nums2[ptr2];
                ptr2--;
            }
            id--;    
        }
        while(ptr2>=0){
            nums1[id] = nums2[ptr2];
            ptr2--;
            id--;
        }
        
        
    }
}