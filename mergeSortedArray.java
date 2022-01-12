/*
Time complexity : O(m+n)
Space complexity: O(1)
*/
public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        /* start comparing the values and filling the 
            values from the last index of nums1.
        */
        for(int i = m+n-1; i >= 0; i--) {
            if(p2 < 0) break;
            if(p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
    }
}