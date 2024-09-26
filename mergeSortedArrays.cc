// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : It ran successfully
// Any problem you faced while coding this : None

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(nums2.size()==0){
            return;
        }
        int ptr1 = m-1;
        int ptr2 = n-1;
        int ptr3 = m + n -1;
        
        while(ptr1 >=0 && ptr2 >= 0){
            if(nums1[ptr1] >= nums2[ptr2]){
                nums1[ptr3] = nums1[ptr1];
                ptr3--;
                ptr1--;
            }
            else{
                nums1[ptr3] = nums2[ptr2];
                ptr3--;
                ptr2--;
            }
        }
        while(ptr2 >= 0){
            nums1[ptr2] = nums2[ptr2];
            ptr2--;
        }
        
    }
};