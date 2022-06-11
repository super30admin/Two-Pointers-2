// Time Complexity : O(N + M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = m + n - 1;

        // No second array
        if (n == 0) return;

        if (m == 0) {
            //copy all from second to first;
            int i = 0;
            for (int element : nums2) {
                nums1[i++] = element;
            }
            return;
        }

        int n1 = m - 1;
        int n2 = n - 1;

        // compare n1 and n2
        while (n1 >= 0 && n2 >= 0) {
            if (nums1[n1] > nums2[n2]) {
                nums1[j--] = nums1[n1--];
            } else {
                nums1[j--] = nums2[n2--];
            }
        }

        // One of them is less than zero...if its n2 just ignore..if n1 then move n2 into n1
        if(n1 < 0) {
            while (n2 >= 0) nums1[j--] = nums2[n2--];
        }

    }
}