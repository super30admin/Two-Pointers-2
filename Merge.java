// TIME: O(m+n)
// SPACE: O(m);
// SUCCESS on LeetCode

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = Arrays.copyOf(nums1, m);
        
        int p1 = 0;
        int p2 = 0;
        int count = 0;
        
        while (p1 < m && p2 < n) {
            if (nums1Copy[p1] < nums2[p2]) {
                nums1[count++] = nums1Copy[p1++];
            } else if (nums1Copy[p1] > nums2[p2]) {
                nums1[count++] = nums2[p2++];
            } else {
                nums1[count++] = nums1Copy[p1++];
                nums1[count++] = nums2[p2++];
            }
        }
        
        if (p1 >= m) {
            for (int i = p2; i < n; i++) {
                nums1[count++] = nums2[i];
            }
        } 
        
        if (p2 >= n) {
            for (int i = p1; i < m; i++) {
                nums1[count++] = nums1Copy[i];
            }
        }
    }
}
