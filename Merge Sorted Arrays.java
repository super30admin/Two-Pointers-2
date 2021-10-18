
// Time Complexity : O(n+m)
// Space Complexity :O(m)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: We are starting from the end index of nums1 where 
//we will insert the largest element by comparing last elements of nums and nums2..this will continue till
//nums1 and nums2 exhaust. if nums2 exhausts frst that means all the nums1 elements are properly placed
//else if nums1 exhausts we will insert all the nums2 element in nums1 as they all are smaller and soerted now

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums2==null || n==0){
            return;
        }
        int i=m-1;
        int j=n-1;
        
        int index=m+n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[index]=nums1[i];
                i--;
            }else{
                nums1[index]=nums2[j];
                j--;
            }
            index--;
        }
        while(j>=0){
            nums1[index]=nums2[j];
            index--;
            j--;
        }
    }
}