// Time Complexity                              :  O(N)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  

// https://leetcode.com/problems/merge-sorted-array/
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        vector<int> ans(m+n);
        int mn = min(m,n);
        
        int r1 = m - 1;
        int r2 = n - 1;
        int r3 = m + n - 1;
        // using three pointer technique to merge 2 sorted arrays
        while(r2 >= 0 and r1 >= 0) {
            if(nums1[r1] > nums2[r2]) {
                nums1[r3] = nums1[r1];
                r1--;
            } else {
                nums1[r3] = nums2[r2];
                r2--;
            }
            r3--;
        }
        
        while(r2 >= 0) {
            nums1[r3] = nums2[r2];
            r2--;
            r3--;
        }
        
    }
};