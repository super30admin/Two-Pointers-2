// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//88. Merge Sorted Array

public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1, p2 = n-1, p3 = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
                p3--;
            }else if(nums1[p1]<nums2[p2]){
                nums1[p3] = nums2[p2];
                p2--;
                p3--;   
            }else if(nums1[p1] == nums1[p1]){
                nums1[p3] = nums1[p1];
                p1--;
                p3--;
            }
        }
        if(p2>-1){
            while(p2>=0){
                nums1[p3] = nums2[p2];
                p3--;
                p2--;
            } 
        }
        
    }
}
