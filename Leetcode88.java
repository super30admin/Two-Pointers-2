// TC - O(m+n)
// SC - O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int second = n - 1;
        int i = m + n - 1;
        while (first >= 0 && second >= 0) { // compare the highest element in each array and add them to the right most
                                            // element on nums1 array
            if (nums1[first] > nums2[second]) {
                nums1[i] = nums1[first];
                first--;
            } else {
                nums1[i] = nums2[second];
                second--;
            }
            i -= 1;
        }
        while (second >= 0) { // if the nums2 array still has items left in it after the above iteration, we
                              // can directly copy them into nums1 array via the i'th pointer. We don't need
                              // to do this for num1 array elements since they are already in place incase
                              // they have been left out.
            nums1[i] = nums2[second];
            second--;
            i -= 1;
        }
    }
}