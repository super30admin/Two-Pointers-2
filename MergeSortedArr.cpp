// Time Complexity : o(size of nums2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int k = nums1.size()-1;
        while(p2>=0) {
            if(p1>=0 && nums1[p1]>nums2[p2]) {
                nums1[k--]=nums1[p1--];
            } else {
                nums1[k--]=nums2[p2--];
            }
        }
    }
}