// Time Complexity : O(m + n) m and n are the sizes of nums1 and nums2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Merge Sorted Array

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        // have 3 pointers
        
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;  // end of extended first array
        
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            
            k--;
        }
        
        //case if second array isn't empty but first is 
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
};