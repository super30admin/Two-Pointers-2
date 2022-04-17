public class MergeSorted {
    // Time complexity: O(m + n)
    // Space complexity: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return;


        int r1 = m - 1;
        int r2 = n - 1;
        int r3 = m + n - 1;

        // Select the greater element from the first and second array
        // Put the greater element at the third pointer
        while(r1 >=0 && r2 >=0) {
            if(nums1[r1] >= nums2[r2]) {
                nums1[r3--] = nums1[r1--];
            }else {
                nums1[r3--] = nums2[r2--];
            }
        }

        // Merge all the pending items from the second array
        while(r2 >= 0) {
            nums1[r3--] = nums2[r2--];
        }
    }
}
