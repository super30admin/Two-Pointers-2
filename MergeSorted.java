public class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = m+n-1;
        int i = n-1;
        while (i>=0 && left>=0) {
            if (nums1[left] < nums2[i]) {
                nums1[right] = nums2[i];
                right--; i--;
            } else {
                nums1[right] = nums1[left];
                right--; left--;
            } 
        }
        while (i>=0) {
            nums1[right] = nums2[i];
            right--; i--;
        }
    }
}
