public class problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

// Time Complexity : O(m+n) -> m and n are elements in matrix by rows and coloumns.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
        if(nums1 == null || nums1.length == 0 ) return;
        
        int p1=m-1;
        int p2=n-1;
        int p3=m+n-1;
        
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
            }else{
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
