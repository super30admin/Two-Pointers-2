// Time Complexity : O(M+N), M and N size of the 2 array
// Space Complexity : O(1), in-place
// Did this code successfully run on Leetcode : Yes
// Approach :
//
// We should compare the last values of the two arrays using 2 pointers, whichever is greater, it should be stored at the last value
// and that pointer should be reduced by 1.
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 && n == 0) return;
        int len = m+n-1;
        int p1 = m-1;
        int p2 = n-1;
        while(p1 >= 0 && p2 >=0){
            // Compare the 2 values at last index in the array, copy the greater value to the last index.
            // Reduce the pointer by 1
            if(nums1[p1] >= nums2[p2]){
                nums1[len] = nums1[p1];
                len--;
                p1--;
            }else{
                nums1[len] = nums2[p2];
                len--;
                p2--;
            }
        }

        // Take cares of scenario where p1 reaches 0, indicating all values in nums1 array are explored and nums2
        // array still has some lower values that needs to be explored
        while(p2 >= 0){
            nums1[len--] = nums2[p2--];
        }
    }
}
