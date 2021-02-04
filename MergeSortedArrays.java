/**
Time complexity: O(m+n)
Space complexity: O(1)
Execute successfully on Leetcode: Yes
Any problems faced: No
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0) {
            return;
        }
        int i = m-1;
        int j = n-1;
        int index = m + n - 1;
        
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
        while(j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }
    }
}
