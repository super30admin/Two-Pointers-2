// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// 1: We use 3 pointers to maintain different positions in both arrays.
// 2: Depending on which element is greater, we swap positions within both arrays and move pointers accordingly
// 3: As we insert, our p3 naturally decreases and condition based, our p1 and p2 pointers decrease
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // last element in purely first array
        int p2 = n - 1; // last element in second array
        int p3 = m + n - 1; // last element in first array

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}