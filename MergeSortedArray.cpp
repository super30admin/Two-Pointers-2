// Time Complexity : O(M+N) where N=Number of anagrams each having length K
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Two pointer technique

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
     
        int high1 = m-1;
        int high2 = n-1;
        int i=m+n-1;
        while(high1>=0 && high2 >=0)
        {
            if(nums1[high1]>nums2[high2])
            {
                nums1[i] = nums1[high1];
                high1--;
            }
            else{
                nums1[i] = nums2[high2];
                high2--;
            }
            i--;
        }
   
        while(high2>=0)
        {
            nums1[i] = nums2[high2];
            high2--;
            i--;
        }
        
    }
};
