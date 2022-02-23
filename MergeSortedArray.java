//Time Complexity: O(log(m+n))
//space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//start adding elements to nums1 from the end, by comparing the 2 arrays for the greater number

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m-1,j=n-1;
        
        int len = m+n;
        
        for(int k=len-1; k>=0 && j>=0; --k) {
            
            //add largest element to the end of nums1
            if(i>= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
        }
    }
}