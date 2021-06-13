
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// We start traversing from the nth to 1st element in the both arrays
// pointer 'i' on nums1 and pointer 'j' on nums2 and k for the sorted result 
class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0)
            return;

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1; // last element in nums1

        // Compare the lasrget between nums1 and nums2 and put it at last place
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // incase if nums2 is not fully iterated than move remaining elements from nums2
        // to nums1 remaining part
        while (j >= 0 && k >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
