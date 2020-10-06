/**
TC : O(m+n)
SC : O(1)
**/
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        
        int index = m + n -1;
        
        while(p1 >= 0 && p2 >=0){
            if(nums2[p2]> nums1[p1]){
                nums1[index] = nums2[p2];
                p2--;
            } else {
                nums1[index] = nums1[p1];
                p1--;
            }
            index--;
        }
        
        //if p2 has not reached zero
        while(p2>=0){
            nums1[index]=nums2[p2];
            index--;
            p2--;
        }
        
        //we dont need to check for p1 because the array would be sorted and in-place in nums1
    }
}