// Time Complexity: O(m + n)
// Space Complexity: O(1)


class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int ptr1 = m-1;
        int i = nums1.size()-1; 
        int ptr2 = n-1; 

        while(ptr1 >= 0 && i > ptr1 && ptr2 >= 0) {
            if(nums2[ptr2] >= nums1[ptr1]) {
                nums1[i] = nums2[ptr2];
                ptr2--; 
                i--;            
            } else if(nums1[ptr1] > nums2[ptr2]) {
                nums1[i] = nums1[ptr1];
                ptr1--;
                i--; 
            }
        }

        while(ptr2 >= 0) {
            nums1[i] = nums2[ptr2];
            ptr2--;
            i--;
        }

        while(i > ptr1) {
            nums1[i] = nums1[ptr1];
            ptr1--; 
            i--; 
        }
    }
};
