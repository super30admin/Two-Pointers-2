/ Time Complexity : O(m+n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No



class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        if(nums1.size()==1 && n==1){
            nums1[0]=nums2[0];
        }
        int i=m-1;
        int j=n-1;
        int k=nums1.size()-1;
            
        while(i>=0 && j >=0){            
            if(nums2[j]>nums1[i]){
                nums1[k--]=nums2[j--];
            }else if (nums2[j]<nums1[i]){
                nums1[k--]=nums1[i--];
            }else {
                nums1[k--]=nums1[i--];
                nums1[k--]=nums2[j--];
            }
            
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
        
    }
};
