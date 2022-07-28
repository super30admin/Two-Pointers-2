
// TC:  O(N)
// SC: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1;
        int p2 = n-1;
        int p3 = (m+n)-1;
        while(p3 != -1 && p3 != p1) {
           if(p1 != -1 && nums1[p1] > nums2[p2]) {
               int temp = nums1[p1];
               nums1[p1] = nums1[p3];
               nums1[p3] = temp;
               p1--;
               p3--;
           } else {
                int temp = nums2[p2];
               nums2[p2] = nums1[p3];
               nums1[p3] = temp;
               p2--;
               p3--;
           }
        }
        
        //TWO-POINTER
//         int slow = 0;
//         if(n!=0) {
//             if(m!=0) {
//                 for(int fast=0;fast<nums1.length && slow<n;fast++) {
//                     if(nums2[slow] < nums1[fast]) {
//                         shiftRight(nums1, fast);
//                         nums1[fast] = nums2[slow];
//                         slow++;
//                     }
//                 }
//             } else {
//                 for(int i=0;i<n;i++) {
//                     nums1[i] = nums2[i];
//                 }
//             }
//         }
       
//         if(slow < n) {
//             for(int i=slow;i<n;i++) {
//                 nums1[m+i] = nums2[i];
//             }
//         }
    }
    
//     public void shiftRight(int[] nums, int val) {
//         for(int i=nums.length-1;i>val;i--) {
//              nums[i] = nums[i-1];
//             // System.out.println(nums[i]);
//         }
        
//     }
}
