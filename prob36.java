// 30 Big N Problem #36 {Easy}
// 88. Merge Sorted Array
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach
//The key to solve this problem is moving element of nums1 and nums2 backwards. If nums2 has some elements left after nums1 is done, also need to handle that case.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m>0 && n>0){
           if(nums1[m-1]>nums2[n-1]){
               nums1[m+n-1]=nums1[m-1];
               m--;
           }else{
               nums1[m+n-1]=nums2[n-1];
               n--;
           }
       }
        
        while(n>0){
            nums1[m+n-1]=nums2[n-1];
            n--;
        }
    }
}
