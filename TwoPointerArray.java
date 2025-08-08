// This uses three pointer technique. One pointer is created to point the last element in the nums1. Two others are m and n. We move from end on both the arrays and iteratively move the biggest element of each to the end of array. At the end we move the remaining elements in both the arrays. Technically only one of the array will be left with elements to move
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m+n-1;
        while(m>0 && n>0) {
            if(nums1[m-1]>=nums2[n-1]) {
                nums1[j--] = nums1[m-1];
                m--;
            } else {
                nums1[j--] = nums2[n-1];
                n--;
            }
        }
        while(m>0) {
            nums1[j--] = nums1[m-1];
            m--;
        }
        while(n>0) {
            nums1[j--] = nums2[n-1];
            n--;
        }
    }
}
