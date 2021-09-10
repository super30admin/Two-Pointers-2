
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YEs
// Three line explanation of solution in plain english
/*In this problem, we initialise 2 pointers set to the second element and a counter variable
initialised to 1, as long as the counter is less than 3, we swap the 2 ptrs and increment 2nd ptr
, otherwise if prev element is same as curr element we increment count, on encountering differnt element
we reset the count*/
// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;


class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size() == 0) return 0;
        int count = 1; // initialise count variable
        int j =1;  // initialise 2nd ptr
        for(int i =1; i<nums.size(); i++)
        {
            if(nums[i] == nums[i-1]){ 
                count++;    // if same as prev element, increment count
            }
            else{
                count = 1;    // reset if different
            }
            if(count<3){
                nums[j] = nums[i];  // for less than 3, change values and increment ptr
                j++;
            }
          
        }
        return j;
    }
};