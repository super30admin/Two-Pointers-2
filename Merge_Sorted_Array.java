class Solution {
    //Time O(N)
    //Space O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0)
        {
            return;
        }
        int i = m+n-1; m--;n--;
        while(m >= 0 && n >= 0 && i >= 0)
        {
            if(nums1[m] <  nums2[n])
            {
                nums1[i] = nums2[n];
                n--;i--;
            }
            else
            {
                nums1[i] = nums1[m];
                i--;m--;
            }
        }
        while(i >= 0 && n >= 0)
        {
            nums1[i] = nums2[n];
            i--;n--;
        }
    }
}