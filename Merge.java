/**
## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
 
Time Complexity :   O (N + M) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (88. Merge Sorted Array)
Any problem you faced while coding this :       No
 */

class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // take 2 pointers for nums1 and nums2
        // k pointer will point to last element of nums1
        int i=m-1, j=n-1, k = m+n -1;

        while( i >= 0 && j >= 0){
            // compare the nums1 and nums2 values, 
            // whichever is larger, copy that into nums K position
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        // Copy remainig element from nums2
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // print nums1
        for(int num: nums1){
            System.out.print(num +" ");
        }
    }

    public static void main(String args[]) 
    { 
        Merge obj = new Merge();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        obj.merge(nums1, m, nums2, n);
    }
}