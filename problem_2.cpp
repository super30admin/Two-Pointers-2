/ Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;
        
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[index] = nums1[p1];
                index--;
                p1--;
            } else {
                nums1[index] = nums2[p2];
                index--;
                p2--;
            }
        }
        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            index--;
            p2--;
        }
    }    
};
