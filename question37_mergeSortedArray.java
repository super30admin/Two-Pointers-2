package TwoPointers2;

import com.sun.jmx.snmp.SnmpUnknownSubSystemException;

import java.util.Arrays;

public class question37_mergeSortedArray {

    /*
        Brute Force:
            Time Complexity: O((n+m)log(n+m))
            Space Complexity: O(1)
    */
    public static void mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < n ; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
        for(int i = 0 ; i < nums1.length ; i++) {
            System.out.println(nums1[i] + " ");
        }
    }

    /*
        Two Pointer:
            Time Complexity: O(n)
            Space Complexity: O(1)
    */
    public static void mergeOpt(int[] nums1, int m, int[] nums2, int n) {

        int[] nums1Copy = new int[m];
        for(int i = 0 ; i < m ; i++) {
            nums1Copy[i] = nums1[i];
        }

        //Pointers
        int p1 = 0;
        int p2 = 0;

        for(int p = 0 ; p < nums1.length ; p++) {
            if(p2 >=n || (p1 < m && nums1Copy[p1] <= nums2[p2])) {
                nums1[p] = nums1Copy[p1];
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p2++;
            }
        }
    }

    /*
        Two Pointer:
            Time Complexity: O(n + m)
            Space Complexity: O(1)
    */
    public static void mergeTwoPointer(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                i--;
                p1--;
            } else {
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }
        while(p2 >= 0) {
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 2;

        mergeBruteForce(nums1, m, nums2, n);
        mergeOpt(nums1, m, nums2, n);
        mergeTwoPointer(nums1, m, nums2, n);
    }
}