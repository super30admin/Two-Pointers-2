// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=0;i<n;i++) {
            nums1[i+m]=nums2[i];  //attach the elements of the second array in the first array
        }
        sort(nums1.begin(),nums1.end()); //sort the array and return it
    }
};