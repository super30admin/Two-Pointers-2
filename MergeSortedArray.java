public class MergeSortedArray {
    /**
     * Time Complexity O(m + n) where m and n are size of nums1 and nums2
     * Space Complexity O(1)
     * Logic: use 3 pointers - 1 pointing the last index of nums1 (n + m - 1), 1 pointing to m -1 (m = len(nums1), and 1 pointing to
     *        n -1  (n = len(nums2))
     *        start looping through 2 arrays as long as i and j >=0
     *        if curr element at jth index in nums2 > curr elem at ith index in nums1 then copy elem from nums2[j] to nums1[lastindex]
     *        decrement j ptr
     *        else if curr elem at ith index in nums1 is > curr elem at jth index in nums2
     *                then copy curr elem from nums1 to nums1[last index]
     *                copy elem from nums2 to nums1[i], decrement i
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[l] = nums2[j];
                j--;
            } else {
                nums1[l] = nums1[i];
                nums1[i] = nums2[j];
                i--;
            }
            l--;
        }

        while (j >= 0) {
            nums1[l] = nums2[j];
            l--;
            j--;
        }
    }
}
