// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class MergeSortedArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int idx = nums1.length-1;
            while (m-1 >= 0 && n-1 >= 0){
                if (nums1[m-1] >= nums2[n-1]){
                    nums1[idx] = nums1[m-1];
                    idx--;
                    m--;
                } else {
                    nums1[idx] = nums2[n-1];
                    idx--;
                    n--;
                }
            }
            while (n > 0){
                nums1[idx] = nums2[n-1];
                idx--;
                n--;
            }
        }

}
