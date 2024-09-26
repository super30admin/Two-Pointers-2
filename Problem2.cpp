// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        int i=m-1;
        int j=n-1;
        int k= m+n-1;
        while(i>=0 && j>=0){
            if(nums2[j]>nums1[i]){
                nums1[k]=nums2[j];
                j--;k--;
            }
            else{
                nums1[k]=nums1[i];
                i--; k--;
            }
        }
        
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
};
