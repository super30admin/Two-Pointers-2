// Time Complexity : O(N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : YES

// Appoarch: Using the three pointers, p1 and p2 for comparing the array
// values and k pointer for replacing values.

// 88. Merge Sorted Array

#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)
    {
        int p1 = m - 1;
        int p2 = n - 1;
        int k = m + n - 1;
        while (p1 >= 0 && p2 >= 0)
        {
            if (nums1[p1] >= nums2[p2])
            {
                nums1[k] = nums1[p1];
                p1--;
            }
            else
            {
                nums1[k] = nums2[p2];
                p2--;
            }
            k--;
        }
        while (p2 >= 0)
        {
            nums1[k] = nums2[p2];
            p2--;
            k--;
        }
    }
};