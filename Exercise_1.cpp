// Time Complexity                              :  O(N)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        if(n == 0) return 0;
        int l = 0;
        int count = 1, f = 1, s = 1;
        // using fast and slow pointer technique
        while(f < n) {
            
            if(nums[f] == nums[f-1]) {
                count++;
            } else {
                count = 1;
            }
            
            if(count <= 2) {
                nums[s] = nums[f];
                s++;
            }
            
            f++;
        }
        
        return s;
    }
};