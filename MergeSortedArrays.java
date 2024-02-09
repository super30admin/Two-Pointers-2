public class MergeSortedArrays {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int itr1 = m - 1;
            int itr2 = n - 1;
            int index = m + n - 1;
            while (itr1 >= 0 && itr2 >= 0) {
                if (nums1[itr1] > nums2[itr2]) {
                    nums1[index] = nums1[itr1];
                    itr1--;
                } else {
                    nums1[index] = nums2[itr2];

                    itr2--;
                }
                index--;
            }
            while (itr2 >= 0) {
                nums1[index] = nums2[itr2];
                index--;
                itr2--;
            }
        }
    }
}