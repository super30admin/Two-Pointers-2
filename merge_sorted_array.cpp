Time Complexity-O(m+n)
Space Complexity-O(1)
Did the code run on Leetcode? Yes

#include <iostream>
#include<vector>
using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int a=nums1.size()-1;
        m--;
        n--;
        while(m>=0 && n>=0)
        {
            if(nums1[m]>nums2[n])
            {
                nums1[a--]=nums1[m--];
            }
            else
            {
                nums1[a--]=nums2[n--];
            }
        }
        while(n>=0)
        {
            nums1[a--]=nums2[n--];
        }
        for(int i=0;i<nums1.size();i++)
        {
            cout<<nums1[i]<<" ";
        }
    }
};

int main() {
	vector<int>nums1={1,2,3,0,0,0};
	vector<int>nums2={2,5,6};
	Solution soln;
	soln.merge(nums1,3,nums2,3);
	return 0;
}