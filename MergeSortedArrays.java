// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) {
            return;
        }

        //Starting from array end
        int i =m-1;
        int j = n-1;
        int k = (m+n)-1;

        // Iterating through the elements and comparing them
        while(i>=0 && j>=0) {
            // Started filling from array end
            // whichever is the larger is put at the last of array
            if(nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

        // It might happen that the elements are left in the second array
        // so filling them in the result array
        while(j>=0) {
            nums1[k--] = nums2[j--];
        }
    }
}
