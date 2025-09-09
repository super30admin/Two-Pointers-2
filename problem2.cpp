// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// We start merging the 2 arrays from the back (largest element first), using 2 pointers and a int to track the index to be filled
// Compare elements at p1 & p2, put the larger element at the index to be filled and decrement the pointer which gave the larger element and decrement the index as well
// In the end, if there are unmerged elements in the nums2 array, merge them 

// Your code here along with comments explaining your approach
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1 = m-1; int p2 = n-1;
        int indexToFill = m+n-1;

        while(p1 >=0 && p2 >= 0) {
            if(nums1[p1] >= nums2[p2]) {
                nums1[indexToFill] = nums1[p1];
                p1--;
            } else {
                nums1[indexToFill] = nums2[p2];
                p2--;
            }
            indexToFill--;
        }
        
        while(p2 >= 0) { // leftover elements from nums2
            nums1[indexToFill] = nums2[p2];
            p2--;
            indexToFill--;
        }
    }
};