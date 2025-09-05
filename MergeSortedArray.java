import java.util.Arrays;

// Time Complexity : O(n) one pass solution
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Approach: We start backwards on both the arrays and compare until both p1, p2 are at index 0, the reason for starting backwards
//is to avoid putting nums2 in an unsorted state. We compare nums at p1 and p2, whichever is greater, goes at the back. p1-- if num at p1 > p2, else p2--. index-- always
//if in case p1 reaches 0 before p2, we put all elements of nums2 starting at p2 index in nums1 array
public class MergeSortedArray {

    /**
     * Merges two sorted arrays nums1, nums2
     *
     * @param nums1  sorted array of size m + n
     * @param m      number of elements in nums1 array
     * @param nums2  sorted array of size n
     * @param n      number of elements in nums2 array
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = m + n - 1, p1 = m - 1, p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }

        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }

    public static void main(String[] args) {
        final MergeSortedArray mergeSortedArray = new MergeSortedArray();

        int[] nums1 = new int[] {1,2,3,0,0,0}, nums2 = new int[] {2, 5, 6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]

        nums1 = new int[] {1,7,8,0,0,0}; nums2 = new int[] {2, 5, 6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1)); // [1, 2, 5, 6, 7, 8]

        nums1 = new int[] {0}; nums2 = new int[] {1};
        mergeSortedArray.merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1)); //[1]
    }
}
