// Time Complexity : O(N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : YES

// Appoarch: Using the two pointer method, keep checking for prev number
// if its repeating increment count and keep checking if its less than k
// and keep replacing the slow with i pointer.

// 80. Remove Duplicates from Sorted Array II

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        int slow = 0;
        int k = 2;
        int count = 1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count<=k){
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow+1;
    }
};