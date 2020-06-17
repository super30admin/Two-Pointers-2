// Time Complexity : O(m+n), where m is the number of elements in nums1 and n is the number of elements in nums2.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int end = m+n-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[end--]=nums1[i--];
            }
            else{
                nums1[end--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[end--] = nums2[j--];
        }
    }                                                                                                                                                                                                           
};