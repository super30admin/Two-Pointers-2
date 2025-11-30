import java.util.Arrays;

// Approach 2: Two pointers + index pointer
// Time: O(m + n)
// Space: O(1)
class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int p1 = m - 1; // for nums1
        int p2 = n - 1; // for nums2
        int index = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            // copy the larger element to the last index
            if (nums1[p1] > nums2[p2]) {
                nums1[index --] = nums1[p1];
                p1 --;
            } else {
                nums1[index --] = nums2[p2];
                p2 --;
            }
        }
        // copy the remaining elements in nums2 to nums1
        while (p2 >= 0) {
            nums1[index --] = nums2[p2 --];
        }
    }
}

// Approach 1: Copy n elements to nums1 array from m index and sort the nums1 array 
// Time: n + (m + n)log(m + n) ~= (m + n)log(m + n)
// Space: O(1)
class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n; i ++, j ++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}