//Time Complexity: O(m+n) ~ O(n)
//Space complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //i: last element of nums1
        //j: last element of nums2
        //k: last element of nums1+nums2 length
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0) {
            
            //comparing the array from the last elements of the 2 arrays
            //if i is greater than j; append in k and decrement i
            //else decrement j
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}