// Time Complexity = O(m+n)
// Space Complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Logic: Maintain 3 pointers, one that ends at nums1 non-zero values, one at the last element on nums2, and one at the end of nums1, and place the larger number at the end of nums1.
// If there are more numbers left if nums2 after the first loop ends, we copy them over to nums1.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) return;
        int i=m-1,j=n-1,k=m+n-1;

        while (i>=0 && j>=0) {
            if (nums1[i] > nums2[j]) {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }

        while (j>=0) {
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
}