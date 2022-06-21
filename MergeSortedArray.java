package com.leetcode;

public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = 0;
            int j = 0;
            int z = 0;
            int arr[] = new int[m+n];
            while(i<m && j <n){
                if(nums1[i]<nums2[j]){
                    arr[z++] = nums1[i++];
                }else{
                    arr[z++] = nums2[j++];
                }
            }
            while(i<m){
                arr[z++] = nums1[i++];
            }
            while(j<n){
                arr[z++] = nums2[j++];
            }
            for(int k = 0; k < arr.length ; k++){
                nums1[k] = arr[k];
            }
        }
    }
}
