/* Problem Statement:
Verified on leetcode

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

    The number of elements initialized in nums1 and nums2 are m and n respectively.
    You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]



 *
 * Time Complexity : O(n^2)
 * Space Complexity : O(1): auxilary complexity 
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>



void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    
    int nums1_ptr = 0; /* num1 array pointer */
    int nums2_ptr = 0; /* num2 array pointer */
    int store_ptr = 0; /* pointer where the next data will be stored */
    
    /* validations */
    if (!nums1Size) {
        
        return;
    }
    /* nums1_ptr,nums2_ptr point to end of the valid number */
    nums1_ptr = m - 1;
    nums2_ptr = n - 1;
    store_ptr = m + n - 1; /* to end of array */
    
    /*
    Input:
        nums1 = [1,2,3,0,0,0], m = 3
        nums2 = [2,5,6],       n = 3

         nums1_ptr = 3 - 1; = 4
         nums2_ptr = 3 - 1; = 4
         store_ptr = 3 + 3 - 1 = 5;
        Output: [1,2,2,3,5,6]
    */
    /* Copy the larger number to store_ptr from either array and keep decrementing it */
    while (nums1_ptr >= 0 && nums2_ptr >= 0) {
        
        if (nums1[nums1_ptr] >= nums2[nums2_ptr]) {
            nums1[store_ptr--] = nums1[nums1_ptr--]; 
        } else {
            nums1[store_ptr--] = nums2[nums2_ptr--];   
        }
    }
    /* Take care of leftovers if any and simply copy it */
    while (nums1_ptr >= 0) {
        nums1[store_ptr--] = nums1[nums1_ptr--];
    }
    while (nums2_ptr >= 0) {
        nums1[store_ptr--] = nums2[nums2_ptr--];
    }
}




int main(int argc, char *argv[]) {
    int m = 3;
    int n = 3;
    int idx = 0;
    int nums1Size = 3;
    int nums2Size = 3;
    int nums1[6] = {1,2,3,0,0,0};
    int nums2[3] = {2,5,6};
    
    merge(nums1, nums1Size, m, nums2, nums2Size, n);

    for (idx = 0; idx < nums1Size + m; idx++) {
      printf("%d ", nums1[idx]);
    }
    printf("\n");

    return 0;
}


