//Time Complexity O(n)
// Space Complexity O(1)
//Problem successfully executed on leetcode
//No problems faced while coading this.


#include<iostream>
#include<vector>
#include<queue>
#include<map>
#include<stack>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i=1;
        int j=1;
        int count=1;
        
        
        while(i<nums.size())
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            
            if (count<=2)
            {
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
};