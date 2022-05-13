//Time Complexity: O(m + n)
//Space Complexity: O(1)
//Leetcode: Yes
public class MergeSortedArrayLeetcode88 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int i = m-1;
            int j = n-1;
            int t = m + n -1;
            for (int k = t; k >=0; k--) {
                //if we are done with 2nd array we already know the array is now done.
                if (j < 0) {
                    return;
                }
                //we need to check because its possible that all the elements in the first array are bigger
                //in that case we still nned to copy all smaller elemts from 2nd array, if we don't check for i it will cause out of bound erros
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i--];
                } else {
                    nums1[k] = nums2[j--];
                }
            }

        }
}
