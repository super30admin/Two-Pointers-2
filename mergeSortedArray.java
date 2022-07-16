// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length ==0) return;
        
        //using 3 pointer approach
        int p1 = m-1; // pointer in nums1
        int p2 = nums1.length-1; // ending pointer in nums1
        int p3 = n-1;//pointer in nums2
        
        while(p3 >=0 && p1 >= 0){
            if(nums1[p1] >= nums2[p3]){
                nums1[p2] = nums1[p1];
                p1--;
            }else{
                nums1[p2] = nums2[p3];
                p3--;
            }
            p2--;
        }
            while(p3>=0){
                nums1[p2]=nums2[p3];
                p2--;
                p3--;

            }
    }
}