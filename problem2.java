// Time Complexity: O(n)
// Space Complexity: O(1)

// We compare the last elements of both arrays and start placing it from the end in nums1 array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mLen = m - 1, nLen = n - 1;
        int index = nums1.length-1;

        while (mLen>=0 && nLen>=0) {
            if (nums1[mLen] > nums2[nLen]) {
                nums1[index--] = nums1[mLen--];
            }
            else {
                nums1[index--] = nums2[nLen--];
            }
        }

        while (nLen>=0) {
            nums1[index--] = nums2[nLen--];
        }
    }
}
