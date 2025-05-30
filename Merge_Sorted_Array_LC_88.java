/*
Time Complexity - O(m+n)
Space Complexity - O(1)
Did this code successfully run on LeetCode :  Yes
Any problem you faced while coding this :  No
*/
public class Merge_Sorted_Array_LC_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n;
        //int nums1Len = m-n;
        //int i, j = 0;
        int len1 = m-1;//2
        int len2 = n-1;

        for(int i = len -1  ; i >= 0; i--){
            if(len2 < 0) break;
            if(len1 >= 0 && nums1[len1] > nums2[len2]){
                nums1[i] = nums1[len1];
                len1--;
            }
            else{
                nums1[i] = nums2[len2];
                len2--;
            }
        }
    }
}
