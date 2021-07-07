Time Complexity-O(n*n)
Space Complexity-O(1)
Did the code run on Leetcode? yes

#include <iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()<=2) return nums.size();
        for(auto i=nums.begin() ;i!=nums.end()-2;)
        {
            if(*i==*(i+1) && *i==*(i+2)) nums.erase(i+2);
            else i++;
        }
        return nums.size();            
    }
};

int main() {
    vector<int>nums1={0,0,1,1,1,1,2,3,3};
    Solution soln;
    int result=soln.removeDuplicates(nums1);
    for(int i=0;i<result;i++)
    {
        cout<<nums1[i]<<" ";
    }
	return 0;
}