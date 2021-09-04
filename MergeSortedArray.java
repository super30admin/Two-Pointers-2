
public class MergeSortedArray {

    // Three Pointers
    // First pointer at start of value 0
    // Second pointer at last of nums2.
    // Third pointer at last of nums1.
    // Compare pointer one and two and move the respective donor array.
    // TC:O(M+N) where M is length of the first array and N is length of the second
    // array
    // SC:O(1) Not using any extra space
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0)
            return;

        int p1 = m - 1;
        int p2 = n - 1;
        int i = nums1.length - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else if (nums1[p1] < nums2[p2]) {
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }

        while (p2 >= 0) {
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }

    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
    }

}
