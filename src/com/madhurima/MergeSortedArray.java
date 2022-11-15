/*
    Time Complexity = O(m + n)
    Space Complexity = O(1)
    Did this code successfully run on Leetcode : yes
 */

package com.madhurima;

import java.util.Arrays;

public class MergeSortedArray {
}

class SolutionA {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 && n == 0){
            return;
        }

        int n1 = m-1;
        int n2 = n-1;
        int n3 = m+n-1;

        while(n1 >= 0 && n2 >= 0){
            if(nums2[n2] > nums1[n1]){
                nums1[n3] = nums2[n2];
                n2--;
            }else{
                nums1[n3] = nums1[n1];
                n1--;
            }
            n3--;
        }

        while(n2 >= 0){
            nums1[n3] = nums2[n2];
            n2--;
            n3--;
        }
    }

    public static void main(String[] args) {
        SolutionA s= new SolutionA();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        s.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
