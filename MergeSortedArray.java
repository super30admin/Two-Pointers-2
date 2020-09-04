import java.util.*;

//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = m + n - 1;

        int i = m - 1;
        int j = n - 1;


        while (i >= 0 && j >= 0){

            //checks rightmost element in both arrays and updates in-place accordingly
            nums1[k--] = nums1[i] > nums2[j]? nums1[i--] : nums2[j--];

        }
        //store remaining elements in the array
        while(i >= 0){
            nums1[k--] = nums1[i--];
        }

        while(j >=0 ){
            nums1[k--] = nums2[j--];
        }

    }
}
