// Time Complexity - O(m+n) - Since we are iterating over the 'nums1' vector with 'm' elements and 'nums2' vector with 'n' elements.
// Space Complexity - O(1) - No extra space is used except for three pointer variables.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
                p3--;
            }
            else{
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }
        }
        
            while(p2 >= 0){
                nums1[p3] = nums2[p2];
            p3--;
            p2--;   
            }
        
    }
};