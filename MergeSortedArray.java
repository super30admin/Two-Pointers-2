// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// 1) Use three pointers from the end: p1 at m-1, p2 at n-1, idx at last index of nums1.
// 2) Place the larger of nums1[p1] and nums2[p2] at nums1[idx], move that pointer and idx left.
// 3) Copy any leftover nums2 elements into nums1 (nums1 leftovers are already in place).


public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int idx = nums1.length - 1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }else{
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }

        while(p2 >= 0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}
