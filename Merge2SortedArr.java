package Day14;

//TC: O(m+n) SC: O(1)
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 */

public class Merge2SortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //Edge case
        if(n == 0) return;

        //Pointer1 to last non zero element of first array
        //Pointer2 to last element of second array
        int ptr1 = m-1;
        int ptr2 = n-1;

        //index to make it point to last position of first array
        int idx = m+n-1;


        //making sure the pointers lie within the array range
        while(ptr1 >= 0 && ptr2 >= 0){
            //if arr1's element > arr2's element put arr1's element in index's pos and move both ptr1 and index
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[idx] = nums1[ptr1];
                ptr1--;
            }
            //if arr2's element happens to be greater put that in index's position and move both
            else{
                nums1[idx] = nums2[ptr2];
                ptr2--;
            }
            //movement of idx happens anyway so mentioned out of conditions' blocks
            idx--;
        }

        //if anymore elements are left in arr2, just moving them to arr1 index's position, moving both pointers till arr2 gets empty
        while(ptr2 >= 0){
            nums1[idx] = nums2[ptr2];
            ptr2--;
            idx--;
        }
    }

    public static void main(String args[]){
        Merge2SortedArr obj = new Merge2SortedArr();

        int nums1[] = new int[]{1,2,3,0,0,0};
        int nums2[] = new int[]{2,5,6};

        int m = 3;
        int n = 3;

        obj.merge(nums1, m, nums2, n);

        for(int i=0; i<m+n; i++){
            System.out.print(nums1[i]+" ");
        }
    }
}