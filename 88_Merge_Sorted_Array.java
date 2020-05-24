
// Time Complexity : O(length of array)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n-1;
        m--;
        n--;
        while(index>=0){
            while(m>=0 && n>=0){
                if(nums1[m]>nums2[n])
                    nums1[index--]=nums1[m--];
                else
                    nums1[index--]=nums2[n--];
            }
            
            while(m>=0)
                nums1[index--]=nums1[m--];
            
            
            while(n>=0)
                nums1[index--]=nums2[n--];
        }
    }
}
