// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int count =1;
        int uni = 1;
        for (int i=1; i<nums.size(); i++) {
            if (nums[i] == nums[i-1]){
                count++;
            }
            else{
                count =1;

            }
            if(count<=2) {
                nums[uni++] = nums[i];
            }
        }
        return uni;
    }
};