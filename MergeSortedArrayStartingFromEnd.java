// TC: O(m + n)
// SC: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i, j, k;
        i = m - 1;
        j = n - 1;
        k = m + n - 1;
        //once we have finished with 2nd array, we are done
        //or if we finish the first array, then the second array has to be copied directly
        while(i >= 0 && j >= 0) {
            if(nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        while(j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}