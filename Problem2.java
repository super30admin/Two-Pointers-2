// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
    //Add the large number to the first array from last.
    //copy the whole second array with remaining elements to first array.

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        
        int len=m+n-1;
        
        while(p1>=0 && p2>=0)
        {
            nums1[len--]= (nums1[p1]>nums2[p2])?nums1[p1--] : nums2[p2--];
        }
        
        for(int i=0;i<p2+1;i++)
            nums1[i]=nums2[i];
    }

}