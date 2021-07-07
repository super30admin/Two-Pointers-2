Time Complexity-O(m+n)
Space Complexity-O(1)
Did the code run on Leetcode? yes

#include <iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()<=2) return nums.size();
        bool flag=0;
        int low=0;
        int high=1;
        while(high<nums.size())
        {
            if(nums[low]==nums[high])
            {
                if(flag==0)
                {
                    flag=1;
                    low++;
                    nums[low]=nums[high];
                    high++;
                }
                else
                {
                    while(high<nums.size() && nums[low]==nums[high])
                    {
                        high++;
                    }
                }
            }
            else
            {
                flag=0;
                low++;
                nums[low]=nums[high];
                high++;
            }
        }
        return low+1;
    }
};

int main() {
	vector<int>nums={0,0,1,1,1,1,2,3,3};
	Solution soln;
	int result=soln.removeDuplicates(nums);
	for(int i=0;i<result;i++)
	{
	    cout<<nums[i]<<" ";
	}
	return 0;
}