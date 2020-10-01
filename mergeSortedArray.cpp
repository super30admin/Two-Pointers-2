//time complexity:O(n)
//space complexity:O(n)
//executed on leetcode: yes
//approach:comparing nums1 and nums2
//any issues faced? no
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        nums1.resize(m);
        nums2.resize(n);
        vector<int>res;
        int i=0; int j=0;
        for(;i<m and j<n;)
        {
            if(nums1[i]<nums2[j])
            {
                res.push_back(nums1[i]);
                i++;
            }
            else
            {
                res.push_back(nums2[j]);
                j++;
            }
        }
        for(;i<m;i++)
            res.push_back(nums1[i]);
        for(;j<n;j++)
            res.push_back(nums2[j]);
        nums1=res;
    }
};