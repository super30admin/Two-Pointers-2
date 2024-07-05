/*
 *                  Merge 2 Sorted Array
 *
 * Leetcode : https://leetcode.com/problems/merge-sorted-array/description/
 * 
 * Time complexity : O(N)
 * Space complexity : O(1)
 * 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Traverse the array with a slow pointer, allowing up to two occurrences of 
 *            each element by maintaining a count and overwriting duplicates in place.
 */
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int idx = m + n - 1;
        while(p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while (p2 >= 0) {
            //Cope elements of second array in the first array
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
     }
};

int main() {
    Solution solution;
    vector<int> nums1 = {1, 2, 3, 0, 0, 0}; // nums1 has enough space to hold additional elements from nums2
    int m = 3; // Number of elements initially in nums1
    vector<int> nums2 = {2, 5, 6};
    int n = 3; // Number of elements in nums2

    solution.merge(nums1, m, nums2, n);

    cout << "Merged array: ";
    for (int num : nums1) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}