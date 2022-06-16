class Solution {

//TC: O(n) sc:O(m)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr =new int[nums1.length];
     int k =0;int i=0;int j=0;
        while (i < m&& j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            }
            else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < m) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int z=0;
        while (z<nums1.length){
            nums1[z]=arr[z];
            z++;
        }
    }
}
