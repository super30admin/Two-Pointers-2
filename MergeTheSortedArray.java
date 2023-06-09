// Time Complexity : O (n+m)
// Space Complexity : O(1)



public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = m - 1, n1 = n - 1;
        int len = m + n - 1;
        while (n1 >= 0) {
            if (m1 >= 0 && nums1[m1] > nums2[n1]) {
                nums1[len--] = nums1[m1--];
            } else {
                nums1[len--] = nums2[n1--];
            }
        }
    }

    
    }