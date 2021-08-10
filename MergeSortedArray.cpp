// Time Complexity : O(M+N) where M is the size of nums1 and N is the size of nums2
// Space Complexity : O(1) as I am not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/merge-sorted-array/
// Submission Link: https://leetcode.com/submissions/detail/536398447/

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int nums1_ptr = m - 1, nums2_ptr = n - 1, high = m + n - 1;
        
        while(nums1_ptr >= 0 && nums2_ptr >= 0){
            if(nums1[nums1_ptr] > nums2[nums2_ptr]){
                nums1[high] = nums1[nums1_ptr];
                nums1_ptr--;
            }
            else{
                nums1[high] = nums2[nums2_ptr];
                nums2_ptr--;
            }
            high--;
        }
        
        if(nums2_ptr >= 0){
            while(nums2_ptr >= 0){
                nums1[high] = nums2[nums2_ptr];
                nums2_ptr--;
                high--;
            }
        }
    }
};