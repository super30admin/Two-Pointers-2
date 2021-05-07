// Time Complexity :O(m) where m in the number elements in the vector nums1
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(m == 0) {
            nums1 = nums2;
            return;
        }
        int ptr1 = m-1;
        int ptr2 = n-1;
        int ptr3 = m+n-1;
        while(ptr1 >=0 && ptr2 >= 0){
           if(nums1[ptr1]>=nums2[ptr2]){
               nums1[ptr3] = nums1[ptr1];
               ptr1--;
            }
            else {
                nums1[ptr3]  = nums2[ptr2];
                ptr2--;
            }
            ptr3--;
        }
        while(ptr2 >=0 && ptr3 >= 0){
            nums1[ptr3] = nums2[ptr2];
            ptr3--;
            ptr2--;
        }
    }
};