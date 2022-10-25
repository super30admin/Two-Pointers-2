/*
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p2>=0&&p1>=0){
            if(nums1[p1]<nums2[p2]){
                nums1[i]=nums2[p2];
                p2--;i--;
            } else if(nums1[p1]>nums2[p2]){
                nums1[i]=nums1[p1];
                p1--;i--;
            } else{
                nums1[i]=nums2[p2];
                p2--;i--;
            }
        }
        while(p2>=0){
            nums1[i]=nums2[p2];
            p2--;i--;
        }
    }
};