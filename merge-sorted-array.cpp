// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int pt1 = m - 1;
        int pt2 = n - 1;
        int index = m + n - 1;

        while (pt2 >= 0 && pt1 >= 0) {
            if (nums2[pt2] > nums1[pt1]) {
                nums1[index] = nums2[pt2];
                pt2--;
            } else {
                nums1[index] = nums1[pt1];
                pt1--;
            }
            index--;
        }

        while (pt2 >= 0) {
            nums1[index] = nums2[pt2];
            pt2--;
            index--;
        }
    }
};