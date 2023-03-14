/**
Time Complexity - O(N) where N is the length of nums1 and nums2.
Space complexity - O(1)
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int ind1 = m - 1;
        int ind2 = n - 1;
        int insertInd = m + n - 1;

        while(ind2 >= 0 && ind1 >= 0)
            nums1[insertInd--] = (nums1[ind1] > nums2[ind2]) ? nums1[ind1--] : nums2[ind2--];
        
        while(ind2 >= 0)
            nums1[insertInd--] = nums2[ind2--];

    }
}
