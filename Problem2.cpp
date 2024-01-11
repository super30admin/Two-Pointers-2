
// Time Complexity : O((m + n) log(m + n)).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int j=0;
        for(int i=m;i<m+n;i++,j++)
        {
            nums1[i]=nums2[j];
        }

        sort(nums1.begin(),nums1.end());
    }
    
};