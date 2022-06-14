// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Just iterating through big array from end and inserting the
// biggest element from both the arrays.

import java.util.Arrays;
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }
            else{
                nums1[idx]=nums2[p2];
                p2--;
            }
            idx--;
        }
        while(p2>=0){
            nums1[idx]=nums2[p2];
            p2--;
            idx--;
        }
        while(p1>=0){
            nums1[idx] = nums1[p1];
            p1--;
            idx--;
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String [] args){
        int [] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3, n = 3;
        int [] nums2 = new int[]{2,5,6};
        MergeSortedArray ms = new MergeSortedArray();
        ms.merge(nums1, m, nums2, n);
    }
}