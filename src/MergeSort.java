public class MergeSort {
    class Solution {

// Time Complexity :O(N)
// Space Complexity :O(!)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=m-1, j=n-1, k=m+n-1;

            while(i>=0 || j>=0)
            {
                if (j < 0) {
                    break;
                }
                if(i>=0  && nums1[i]>nums2[j])
                {
                    nums1[k--] = nums1[i--];

                }
                else{
                    nums1[k--] = nums2[j--];

                }
            }
        }
    }
}
