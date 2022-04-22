// Time Complexity : o(m+n)
// Space Complexity :o(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //base case
        if(nums1==null && nums2==null)
            return;
        //divide the nums1 array into and place a pointer at the index
        int r1=m-1; //for nums1 array
        int r2=n-1; //for nums2 array
        int r3=m+n-1; //for 0's in nums1 array
        //as r1, r2 are moving back to front check if >=0 or not
        while(r1>=0 && r2>=0){
            //then everything goes into r3
            if(nums1[r1]>=nums2[r2]){
                nums1[r3]=nums1[r1];
                r1--;
            }
            else{
                nums1[r3]=nums2[r2];
                r2--;
            }
            r3--;
        }
        //check if any elements are remaining in nums2 array
        while(r2>=0){
            //then copy values from these index
            nums1[r3]=nums2[r2];
            r2--;
            r3--;
        }
    }
}
