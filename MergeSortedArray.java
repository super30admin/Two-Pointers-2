/*
 * Time Complexity : O(m+n)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - In this we have two pointers from the end of both the arrayas to be merged. We have another pointer(i) at the end
 * of the first array with extra spaces. We compare the elements of each array and the highest element we push to the ith position.
 * Which ever element we pushed we decrement the pointer for that array. At the end if the 2nd array has elements left over we copy all of them into the ith position
 * of the 1st array.
 */

//https://leetcode.com/problems/merge-sorted-array/description/
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=nums1.length-1;
        int p1=m-1,p2=n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[i]=nums1[p1];
                p1--;
            }else{
                nums1[i]=nums2[p2];
                p2--;
            }
            i--;
        }
        while(p2>=0){
            nums1[i]=nums2[p2];
            i--;
            p2--;
        }
    }
}