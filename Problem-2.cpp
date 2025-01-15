// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* 
    1. Use of pointers to keep track of elements ion both the arrays for comparison 
    2. insert elements which is greater than and move the pointer
    3. Validate and insert the elements in the parent array
*/

// Your code here along with comments explaining your approach


class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int curr = nums1.size()-1;

        while(m-1>=0 && n-1>=0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[curr] = nums1[m-1];
                m--;
                curr--;
            }
            else{
                nums1[curr] = nums2[n-1];
                n--;
                curr--;
            }
        }

        if(n-1>=0){
            while(n-1>=0){
                nums1[curr] = nums2[n-1];
                n--;
                curr--;
            }
        }
    }
};