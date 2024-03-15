// Time Complexity : O(n + m)             
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/merge-sorted-array/

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order
*/

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int nums1Ptr = nums1.size()-1;  // tracks end of nums1 complete array
        int nums1Mid = m-1;             // tracks end of nums1 array
        int nums2Ptr = n-1;             // tracks end of nums2

        if(n == 0) return;

        while (nums2Ptr >= 0){
            if(nums1Mid < 0){
                for(int i =0; i<= nums2Ptr; i++){
                    nums1[i] = nums2[i];
                }
                break;
            } else if(nums1[nums1Mid] > nums2[nums2Ptr]){
                std::swap(nums1[nums1Mid], nums1[nums1Ptr]);
                nums1Mid--;
                nums1Ptr--;
            } else {
                nums1[nums1Ptr] = nums2[nums2Ptr];
                nums1Ptr--;
                nums2Ptr--;
            }
        }
    }
};