// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * We will start feeling nums1 from backside where highest element will go.
 * So we will use two pointers, one will point at last element of nums2 and other point at last element of nums1.
 * If element of nums1 is higher then that element will go at last loc else element of nums2.
 * We will continue this both pointers are greater than or equal to 0.
 * As soon as one of them reaches negative, we check if all elements from nums2 has entered in nums1.
 * If yes, we are done. If no, we put them in nums1. No need to do the same to nums1 as it is already sorted
*/
// Your code here along with comments explaining your approach



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int loc = n + m - 1;
        int ptr1 = m-1;
        int ptr2 = n-1;
        
        while(ptr1 >= 0 && ptr2 >= 0){
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[loc] = nums1[ptr1];
                ptr1--;
            }else{
                nums1[loc] = nums2[ptr2];
                ptr2--;
            }
            loc--;
        }
        
        while(ptr2>= 0){
            nums1[loc] = nums2[ptr2];
            loc--;
            ptr2--;
        }
    }
}