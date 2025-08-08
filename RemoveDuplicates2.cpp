#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
Take a slow and a fast pointer, as we can have at most 2 duplicate elements we place the pointers at index 2
check if the size of the nums array is less than k and then within the loop check for unique elements within k times
if it is not equal increment the slow pointer otherwise increment the fast pointer
*/
class Solution{
public:
    int removeDuplicates(vector<int>& nums) {
        int k=2;
        int slow=k, fast=k;
        if(nums.size()<k) return nums.size();
        while(fast<nums.size()){
            if(nums[fast] != nums[slow-k]){//on a unique element within k times
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;

    }
};
