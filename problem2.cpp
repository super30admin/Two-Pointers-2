// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution{
    public:
        void merge(vector<int> nums1, int m, vector<int> nums2, int n)
        {
            int a = m - 1; 
            int b = n - 1;
            int i = m + n - 1;

            while(i >= 0)
            {
                if(b < 0) break;

                else if(a < 0)
                {
                    nums1[i] = nums2[b];
                    b--;
                }

                else if(nums2[b] >= nums1[a])
                {
                    nums1[i] = nums2[b];
                    b--;
                }

                else {
                    nums1[i] = nums1[a];
                    a--;
                }

                i--;
            }
        }
    
};