//TC: O(m+n)
//SC: O(1)
//approach: start two pointer from end of both arrays, and one more pointer to keep track of end of entire sorted nums1 array

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int ep = nums1.length-1;
        if(m == 0 && n>0){
            System.arraycopy(nums2, 0, nums1, 0, n - 1 + 1);
            return;
        }
        while(p2>=0){
            if (p1<0 || nums2[p2] > nums1[p1]){
                nums1[ep] = nums2[p2];
                p2--;
            } else{
                nums1[ep] = nums1[p1];
                p1--;
            }
            ep--;
        }
    }
}
