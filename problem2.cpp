/*
Time complexity - O(M+N)
Space complexity - O(1)
*/
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if (nums1.size() == 0 || nums2.size() == 0) return;
        int ptr1 = m - 1, ptr2 = n - 1, i = m + n - 1;
        while (ptr1 >= 0 && ptr2 >= 0){
            if (nums1[ptr1] > nums2[ptr2]) nums1[i--] = nums1[ptr1--];
            else nums1[i--] = nums2[ptr2--];
        }
        while (ptr2 >= 0) nums1[i--] = nums2[ptr2--];
    }
};