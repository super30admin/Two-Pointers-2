// Time Complexity : O(N) 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Search for largest elements from both sorted arrays.
// 2. We are taking largest because we can put elements at last of first array and decrement counter. 



class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int nn=nums1.size()-1;
        while((m-1)>=0 && (n-1)>=0){
            if(nums1[m-1]<nums2[n-1]){
                nums1[nn]=nums2[n-1];n--;nn--;
            }else{
                nums1[nn]=nums1[m-1];m--;nn--;
            }
        }
        while((n-1)>=0){
            nums1[nn]=nums2[n-1];n--;nn--;
        }

    }
};