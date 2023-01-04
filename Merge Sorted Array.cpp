// TC = O(m + n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        // TC = O(m + n)
        // SC = O(1)
        // null
        if(n == 0) return;
        int p1 = m - 1, p2 = n - 1, idx = m + n - 1;
        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2])
                nums1[idx--] = nums1[p1--];
            else
                nums1[idx--] = nums2[p2--];
        }
        // check for nums2 if there are elements, no need to check for nums1 as they'd be in proper place (in place)
        while(p2 >= 0)
            nums1[idx--] = nums2[p2--];
        return;
    }
};