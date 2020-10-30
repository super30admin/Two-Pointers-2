// Time Complexity :O(nums1.length)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No




class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
      if(nums1.length==0 || nums1 == null || nums2.length==0 || nums2==null) return;
        
        // set p2 to last index of nums2
        int p2 = n-1;
        // set i to to last index of nums1
        int i = nums1.length-1;
        
        // set p1 to last index of non zero element of nums1
        int p1 = m-1;
        
        // while p1 and p2 dont go out of bounds
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
        
        // pointer 2 should go out of bound, thats y this loop
        
        while(p2>=0){
            nums1[i]=nums2[p2];
                p2--;
            i--;
            
        }
        
        
        
    }
}