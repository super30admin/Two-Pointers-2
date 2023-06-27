package prog_88_mergeSortedArrays;

class Solution {
    /**
     In this problem we have two array and we have to merge both the arrays, in first array, extra space is given for
     storing additional elements from 2nd array.
     In this solution we will maintain pointer at the end of array
     p1       place
     [1,6,7, 0, 0, 0]
     p2
     [2,3,4]
     When value of p1 is greater than value of p2 then put the greater value to place pointer's spot and place -- and
     move pointer p1 to left p1 ---
     When p2 is greater then put the greater value to place spot and move place and pointer p2 to left p2 -- place --
     If we to do it untill both the pointers reaches to index 0

     Time Complexity :
     O(M+N) where M are the number of elements in 1st array and N are the number of elements in 2nd array.

     Space Complexity : O(1)
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -1 ;
        int p2 = n -1 ;
        int place = m+ n -1 ;
        while(p1 >=0 && p2 >= 0){
            if( nums1[p1] >= nums2[p2]){
                nums1[place] = nums1[p1];
                p1 -- ;
                place -- ;

            }
            else{
                nums1[place] = nums2[p2];
                p2 --;
                place -- ;
            }
        }
        while(p2>=0){ //If our p1 reaches zero, and we still some elements in 2nd array,
            //then we will copy all the elements inn remaining places of first array.
            nums1[place] = nums2[p2];
            p2 --;
            place -- ;
        }


    }
}