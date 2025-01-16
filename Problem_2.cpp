// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 88: Merge Sorted Array
// Approach: 2 Pointers (Using 3 Pointers)
// Time Complexity: O(m+n)

class Solution
{
public:
    void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)
    {

        // Base case
        if (nums1.empty())
        {
            return;
        }

        // Initialize three pointers:
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        // Condition for while loop, Iterate while both pointers p1 and p2 are within their valid ranges.
        while (p1 >= 0 && p2 >= 0)
        {

            // Place the larger of nums1[p1] and nums2[p2] at nums1[p3].
            nums1[p3] = max(nums1[p1], nums2[p2]);
            p3--;

            // If nums1[p1] is larger, decrement p1. Otherwise, decrement p2.
            if (nums1[p1] > nums2[p2])
            {
                p1--;
            }
            else
            {
                p2--;
            }
        }

        // For the remaining elements in nums2, copy into nums1.
        while (p2 >= 0)
        {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
};
