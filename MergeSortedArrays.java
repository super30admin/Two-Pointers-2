// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

/*use two pointers and start from the end of the array and merge based on which is greater.
 * if elements still left in 2nd array, copy over everything to 1st.
*/

public class MergeSortedArrays
{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n;
        int i = m-1;
        int j = n-1;
        int idx = len -1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[idx] =nums1[i];
                i--;
            }else{
                nums1[idx] = nums2[j];
                j--;
            }
            idx--;
        }
        while(j>=0){
            nums1[idx--] = nums2[j--];
        }
    }
}