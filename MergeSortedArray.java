//Time complexity =O(m+n)
//Space complexity = O(1)
//LinkedIn interview
//Brute force :Array1 is comparing with Array 2 in place of given array1 the zeros's compare the array1 with array2 and fill the 0's in sorted order.

//Using 3 pointer approach:one ptr at starting array and second ptr at second array2 starting index value and final last pointer at the total array length of the  pointer 3 is M+N .It compare and arrange them in sorted order using 3 pointers. 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0) return;
        
        int p1 = m-1;//nums1
        int p2 = n-1;//nums2
        int p3 = m+n-1;//nums1
        
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
            } else{
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        while(p2>=0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
        
    }
}