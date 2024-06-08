// Time Complexity : O(m+n) where m, n are sizes of nums1 and nums2 array
// Space Complexity : O(1) no extra space apart from couple of variables and nums1 array is modified in-place
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int curr_fill = m+n-1;
        while(p1>=0 && p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[curr_fill] = nums1[p1];
                p1--;
            }
            else if(nums1[p1]<=nums2[p2])
            {
                nums1[curr_fill] = nums2[p2];
                p2--;
            }
            curr_fill--;
        }
        while(p1>=0)
        {
            nums1[curr_fill] = nums1[p1];
            curr_fill--;
            p1--;
        }

        while(p2>=0)
        {
            nums1[curr_fill] = nums2[p2];
            curr_fill--;
            p2--;
        }
    }
};