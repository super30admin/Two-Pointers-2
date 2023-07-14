// Time Complexity : 0(m+n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//here we are using two pointer approach p1 at m's last index and p2 at n's last index.
// And we are also taking index i, where we need to merge the second array. As both are sorted
// array we are starting from end. Then we are placing values comparing p1 and p2.

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = p1 + p2 + 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums2[p2] > nums1[p1]) {
                nums1[i] = nums2[p2];
                i--;
                p2--;
            } else {
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }
        }
        // if anything left in p2 then we just need to add at the ith index of nums1
        while (p2 >= 0) {
            nums1[i] = nums2[p2];
            i--;
            p2--;
        }

    }
}
