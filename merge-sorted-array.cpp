/*
Use three pointers: p1 for iterating through the first array, p2 for iterating through the second array, and p for updating the merged array from the end.
Compare elements at p1 and p2, and update nums1 at index p with the greater element, decrementing the corresponding pointer (p1 or p2).
Continue this process until all elements from nums2 are merged into nums1.
Time Complexity: O(m + n) - Linear time complexity as it involves a single pass through both arrays.
Space Complexity: O(1) - Constant extra space used, as the modification is done in-place.
*/
#include<bits/stdc++.h>
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
     int p1 = m - 1;
        int p2 = n - 1;
        
        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
        }
    }
};