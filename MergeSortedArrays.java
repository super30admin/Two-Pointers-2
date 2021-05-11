/*
Desc: Using a pointer at end of the first array and another at end of second, we compare and enter the greater element from the end of the first array.
Time Complextity: O(n)
Space Complextity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        int i=m+n-1;
        while(ptr1>=0 && ptr2>=0){
            if (nums1[ptr1]>nums2[ptr2]){
                nums1[i] = nums1[ptr1];
                ptr1--;//if we found that first array has the greatest element we copy it and put it from. the end of the array
            }else{
                nums1[i] = nums2[ptr2];
                ptr2--;//if first case is a fallacy we place the greatest element of second array to the next consecutive element from the right.
            }
            i--;
        }
        while(ptr2>=0){
            nums1[i] = nums2[ptr2];
            ptr2--; i--;
        }
    }
}
