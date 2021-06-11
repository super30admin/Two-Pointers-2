import java.util.Arrays;

public class MergeSortedArray {


/*
TC :O(m+n log(m+n))
SC : O(n)
 */

    /**
     * The apprroach is simple. Fill all elements in nums1 and sort the whole array
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /*
     // Time Complexity : O(m+n) worst case when we start from top-right and end at bottom-left element
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
//problems faced  : No
     */


    /**
     * In this approach we start filling the array from the end. and once we start overwriting the the first m values in nums1,
     * we will have already written those m values into its new appropriate position.
     * This way we can perform in O(1) space.
     * @param A
     * @param m
     * @param B
     * @param n
     */
    public void merge_inplace(int[] A, int m, int[] B, int n)
    {
        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while(i >=0 && j>=0)
        {
            if(A[i] > B[j])
                A[k--] = A[i--];
            else
                A[k--] = B[j--];
        }
        while(j>=0)
            A[k--] = B[j--];
    }


    /*
    TC : O(m+n)
    SC :O(n)
    Leetcode : yes
    Problem :no
     */

    /**
     * In this apprroach, we start filling frm the beginning and hence we need another array to store the data of nums1.
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge_start_from_beginning(int[] nums1, int m, int[] nums2, int n)
    {

        int i=0;
        int j=0;
        int k = 0;

        int[] nums1Copy = new int[m];
        for (int a = 0; a < m; a++) {
            nums1Copy[a] = nums1[a];
        }
        while(i < m  && j < n)
        {
            if(nums1Copy[i] <= nums2[j])
                nums1[k++] = nums1Copy[i++];
            else
                nums1[k++] = nums2[j++];
        }

        while(j<n)
            nums1[k++] = nums2[j++];
        while(i<m)
            nums1[k++] = nums1Copy[i++];
    }
}
