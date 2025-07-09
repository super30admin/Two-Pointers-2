/*88. Merge Sorted Array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Constraints:
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */
/*
Time Complexity:O(m+n)
Space Complexity:O(1)
Approach:We merge nums2 into nums1 starting from the end to avoid overwriting values. Use three pointers:
i for the last element in nums1 (excluding placeholders),
j for the last element in nums2,
k for the last position in nums1.
Compare nums1[i] and nums2[j]. Place the larger one at nums1[k] and move the pointers accordingly. Continue until all elements from nums2 are merged.
Remaining elements in nums1 are already in place, so we only copy leftover elements from nums2 if any..
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;
        }
        int i = m - 1; // Index for nums1
        int j = n - 1; // Index for nums2
        int k = m + n - 1; // Index for the merged array (nums1)
        // Compare elements from the back and place the larger one at the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {// Place nums1[i] at the end
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];// Place nums2[j] at the end
                j--;
            }
            k--;// Move backward in merged array
        }

        // If any elements left in nums2, copy them (nums1's leftover are already in
        // place)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}