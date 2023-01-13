public class Problem2 {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }
        int p1 = 0, p2 = 0, idx = 0;
        while (p1 < m && p2 < n) {
            if (nums1Copy[p1] < nums2[p2]) {
                nums1[idx++] = nums1Copy[p1++];
            } else {
                nums1[idx++] = nums2[p2++];
            }
        }
        while (p1 < m) {
            nums1[idx++] = nums1Copy[p1++];
        }
        while (p2 < n) {
            nums1[idx++] = nums2[p2++];
        }
    }
}
