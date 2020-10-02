// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Your code here along with comments explaining your approach: Using 3 pointers and updating according to the requirement

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Base case
     //   nums1[] != 0;
        
       int left = m-1;
        int right = n-1;
        int ctr = m+n-1;
       while(left>=0 && right>=0){
        if(nums1[left] < nums2[right]){
            nums1[ctr] = nums2[right];
            ctr--;
            right--;
        }
        else{
            nums1[ctr] = nums1[left];
       //     nums1[left] = nums2[right];
            ctr--;
            left--;
        }
       }
        while(right >= 0){
            nums1[ctr] = nums2[right];
            right--;
            ctr--;
        }
    }
}
