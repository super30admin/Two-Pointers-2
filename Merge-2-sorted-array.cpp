// Time Complexity : O(m+n)
// Space Complexity : O(m)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(nums1.size()==0){
            return;
        }
        int i=m+n-1, p1 = m-1, p2 = n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            }
            else{
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }
        while(p2 >= 0){
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
    }
};
