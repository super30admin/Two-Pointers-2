// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution
{
public:
    void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)
    {
        vector<int> x;
        int i = 0;
        int j = 0;
        while (i < m && j < n)
        {
            if (nums1[i] < nums2[j])
            {
                x.push_back(nums1[i]);
                i++;
            }
            else
            {
                x.push_back(nums2[j]);
                j++;
            }
        }
        while (i < m)
        {
            x.push_back(nums1[i]);
            i++;
        }
        while (j < n)
        {
            x.push_back(nums2[j]);
            j++;
        }
        nums1 = x;
    }
};