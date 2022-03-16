/**
 * Time complexity is O(m+n)
 * space complexity is O(1)
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        
        while(k >= 0 && i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;k--;
            }
            else {
                nums1[k] = nums2[j];
                j--;k--;
            }
        }
        while(k >= 0) {
            if(i >= 0) {
                nums1[k] = nums1[i];
                i--;k--;  
            }
            else {
                nums1[k] = nums2[j];
                j--;k--;
            }
        }
        
    }
}