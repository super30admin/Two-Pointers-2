// Time Complexity :O(m+n)
// Space Complexity: O(1)
// Ran on leetcode : Yes
// Any problems: no
public class MergeSortedArray {
    public void merge(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m - 1; // initialised to last actual element in nums1
        int p2 = n - 1; // initialised to last element in nums2
        int idx = m + n - 1; // index for placemnt of merge array (end of nums)

        // merge nums1 and mums 2 starting from the end

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        // if there are remaining elements in nums2 copy them to nums1
        while (p2 >= 0) {
            nums1[idx] = nums2[p2];
            idx--;
            p2--;

        }
    }

    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, nums2, m, n);
        System.out.println("Merged Array: ");
        for (int num : nums1) {
            System.out.println(num + "");
        }
    }
}
