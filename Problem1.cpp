// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Remove Duplicates

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int slow = 1;
        int fast = 1;
        int count = 1;
        int k = 2;      // generalized case to remove duplicates, k = 2 to keep two elements
        
        
        while(fast < nums.size()){
            
            if(nums[fast] == nums[fast - 1])
                count++;
            else
                count = 1;
            
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
            
            fast++;
        }
        return slow;
    }
};