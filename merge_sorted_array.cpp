// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Idea here is we use three pointers, one pointer pointing to end of nums2, other pointing to m-1 and third pointer 
// pointing to m+n-1. We check elements from nums1 and nums2. If we encounter larger number, then we add it to the end of nums1 array
// we keep checking this until the nums1 array has all elements sorted.

// Your code here along with comments explaining your approach
#include<vector>

class Solution {
public:
    void merge(std::vector<int>& nums1, int m, std::vector<int>& nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;

        while(p1>=0 && p2>=0)
        {
            // If p1 element is > than p2 element then send p1 to end of nums1
            if(nums1[p1] > nums2[p2])
            {
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }
            else // if p2 element is > than p1 element then send p2 to end of nums1
            {
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }
        while(p2 >= 0)
        {
            // If p2 elements are less than p1 elements, just add them to nums1
            nums1[i] = nums2[p2];
            i--;
            p2--;
        }
    }
};