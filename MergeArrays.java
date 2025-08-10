public class MergeArrays {
    /*
Time Complexity: O(m + n), where m and n are the lengths of nums1 and nums2 arrays respectively.
Space Complexity: O(1), merging is done in-place without extra space.
Did this code successfully run on Leetcode: Yes

Explanation:
- We merge two sorted arrays nums1 and nums2 into nums1 in-place.
- Use three pointers:
  - l at the end of the valid part of nums1 (m-1)
  - r at the end of nums2 (n-1)
  - mid at the end of nums1 array (m + n - 1)
- Compare nums1[l] and nums2[r], put the larger one at nums1[mid], and move pointers accordingly.
- Continue until either array is exhausted.
- If nums2 still has remaining elements, copy them into nums1.
*/


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m - 1; // pointer for nums1's last valid element
        int r = n - 1; // pointer for nums2's last element
        int mid = m + n - 1; // pointer for the end of nums1 array

        while (l >= 0 && r >= 0) {
            if (nums1[l] < nums2[r]) {
                nums1[mid] = nums2[r];
                r--;
            } else {
                nums1[mid] = nums1[l];
                l--;
            }
            mid--;
        }

        // If nums2 still has elements, copy them over
        while (r >= 0) {
            nums1[mid] = nums2[r];
            mid--;
            r--;
        }
    }

    // Example usage
    public static void main(String[] args) {
        MergeArrays sol = new MergeArrays();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
