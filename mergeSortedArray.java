
// Time Complexity : O(M+N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0)
            return;
        //Initialize 2 pointers ant the end of each array
        int first = m - 1;
        int second = n - 1;
        
        for(int i = m+n-1; i >= 0; i--){
            //if 2nd pointer is less than 0 then end the case
            if(second < 0){
                break;
            }
            //if first pointer has value less than 2nd pointer just add the value at ith position and decremenet the 1st pointer
            if(first>=0 && nums1[first] > nums2[second]){
                nums1[i] = nums1[first];
                first--;
            }else{
                nums1[i] = nums2[second];
                second--;
            }
        }
    }
}