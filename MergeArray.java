//Time Complexity: O(m+n)
//Space Complexity: O(1)

public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1;
        int r2 = n - 1;
        int mid = m + n - 1;

        while(r1 >=0 && r2 >= 0) {
            if(nums1[r1] >= nums2[r2]) {
                nums1[mid] = nums1[r1];
                r1--;
            } else {
                nums1[mid] = nums2[r2];
                r2--;
            }
            mid--;
        }
        while(r2 >= 0) {
            nums1[mid] = nums2[r2];
            mid--;
            r2--;
        }
    }
}
