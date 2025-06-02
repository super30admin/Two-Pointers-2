//Time Complexity :O(n)
//Space Complexity : O(1)

#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int k = 2;
        int slow = 1,cnt=1;
        for(int i=1;i<nums.size();i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            }
            else{
                cnt=1;
            }
            if(cnt<=k){
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }
};
